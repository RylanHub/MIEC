package Lab7;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class SortMovie {
	public static void main(String[] args) {
	
		System.out.println("Highest to Lowest / Lowest to Highest: ");
		Scanner SM = new Scanner(System.in);
		String order = SM.nextLine();
		System.out.println("movieName / releaseYear /  rating: ");
		String base = SM.nextLine();
		SM.close();

		String[] MovieList = moviesReader();
		String[] info = new String[MovieList.length];
		String[] name = new String[MovieList.length];
		int[] year = new int[MovieList.length];
		double[] rating = new double[MovieList.length];

		Movie[] movies = new Movie[MovieList.length];

		for (int i = 0; i < MovieList.length; i++) {
			info = MovieList[i].split(",");
			rating[i] = Double.parseDouble(info[0]);
			name[i] = info[1];
			year[i] = Integer.parseInt(info[2]);

		}

		if (order.equals("Highest to Lowest")) {
			System.out.println();

			if (base.equals("movieName")) {
				sortName_HL(name, rating, year);

			}
			if (base.equals("releaseYear")) {
				sortYear_HL(name, rating, year);
			}
			if (base.equals("rating")) {
				// default
			}

		}

		if (order.equals("Lowest to Highest")) {
			System.out.println();

			if (base.equals("movieName")) {
				sortName_LH(name, rating, year);
			}
			if (base.equals("releaseYear")) {
				sortYear_LH(name, rating, year);
			}
			if (base.equals("rating")) {
				sortRating_LH(name, rating, year);
			}

		}

		for (int i = 0; i < MovieList.length; i++) {
			movies[i] = new Movie(name[i], year[i], rating[i]);
			movies[i].printMovieDetails();
			System.out.println();
		}

	}

	public static String[] moviesReader() {
		String myfile = "D:\\Projects\\eclipse\\Rylan\\CS162\\src\\Lab7\\Movies.txt";
		ArrayList<String> lines = new ArrayList<String>();
		try {
			BufferedReader abc = new BufferedReader(new InputStreamReader(new FileInputStream(myfile), "UTF-8"));
			String line;
			while ((line = abc.readLine()) != null) {
				if (line.length() > 8) {
					lines.add(line);
				}
			}
			abc.close();
		} catch (FileNotFoundException ex) {
			System.out.println("Unable to open file '" + myfile + "'");
		} catch (IOException ex) {
			System.out.println("Error reading file '" + myfile + "'");
		}
		return lines.toArray(new String[] {});
	}

	public static void sortName_HL(String[] name, double[] rating, int[] year) {
		for (int i = 1; i < rating.length; i++) {
			for (int j = 0; j < rating.length - 1; j++) {
				if (name[j].compareTo(name[j + 1]) < 0) {

					String tempN = name[j];
					double tempR = rating[j];
					int tempY = year[j];

					name[j] = name[j + 1];
					rating[j] = rating[j + 1];
					year[j] = year[j + 1];

					name[j + 1] = tempN;
					rating[j + 1] = tempR;
					year[j + 1] = tempY;

				}
			}

		}

	}

	public static void sortYear_HL(String[] name, double[] rating, int[] year) {
		for (int i = 1; i < rating.length; i++) {
			for (int j = 0; j < rating.length - 1; j++) {
				if (year[j] < year[j + 1]) {

					String tempN = name[j];
					double tempR = rating[j];
					int tempY = year[j];

					name[j] = name[j + 1];
					rating[j] = rating[j + 1];
					year[j] = year[j + 1];

					name[j + 1] = tempN;
					rating[j + 1] = tempR;
					year[j + 1] = tempY;

				}
			}

		}

	}

	public static void sortName_LH(String[] name, double[] rating, int[] year) {
		for (int i = 1; i < rating.length; i++) {
			for (int j = 0; j < rating.length - 1; j++) {
				if (name[j].compareTo(name[j + 1]) > 0) {

					String tempN = name[j];
					double tempR = rating[j];
					int tempY = year[j];

					name[j] = name[j + 1];
					rating[j] = rating[j + 1];
					year[j] = year[j + 1];

					name[j + 1] = tempN;
					rating[j + 1] = tempR;
					year[j + 1] = tempY;

				}
			}

		}

	}

	public static void sortYear_LH(String[] name, double[] rating, int[] year) {
		for (int i = 1; i < rating.length; i++) {
			for (int j = 0; j < rating.length - 1; j++) {
				if (year[j] > year[j + 1]) {

					String tempN = name[j];
					double tempR = rating[j];
					int tempY = year[j];

					name[j] = name[j + 1];
					rating[j] = rating[j + 1];
					year[j] = year[j + 1];

					name[j + 1] = tempN;
					rating[j + 1] = tempR;
					year[j + 1] = tempY;

				}
			}

		}

	}

	public static void sortRating_LH(String[] name, double[] rating, int[] year) {
		for (int i = 1; i < rating.length; i++) {
			for (int j = 0; j < rating.length - 1; j++) {
				if (rating[j] > rating[j + 1]) {

					String tempN = name[j];
					double tempR = rating[j];
					int tempY = year[j];

					name[j] = name[j + 1];
					rating[j] = rating[j + 1];
					year[j] = year[j + 1];

					name[j + 1] = tempN;
					rating[j + 1] = tempR;
					year[j + 1] = tempY;

				}
			}

		}

	}

}
