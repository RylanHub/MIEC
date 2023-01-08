package Lab1;

import java.util.Scanner;

public class PrintDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

        String[][] d = { { " ", "--", " " },
                         { "|", "  ", "|" },
                         { " ", "--", " " },
                         { "|", "  ", "|" },
                         { " ", "--", " " } };

        Scanner PD = new Scanner(System.in);
        String pd = PD.nextLine();
        PD.close();
        

        for (int r = 0; r < pd.length(); r++) {
            char p = pd.charAt(r);

            if (p == '0') {
                for (int i = 0; i < d.length; i++) {
                    for (int t = 0; t < d[0].length; t++) {
                        if (i == 2 && t == 1) {
                            System.out.print("  ");
                        } else System.out.print(d[i][t]);
                    }
                    System.out.println();
                }
            }

            if (p == '1') {
                for (int i = 0; i < d.length; i++) {
                    for (int t = 0; t < d[0].length; t++) {
                        if (i == 1 && t == 2) {
                            System.out.print(d[1][2]);
                        } else if (i == 3 && t == 2) {
                            System.out.print(d[3][2]);
                        } else
                            System.out.print(" ");
                    }
                    System.out.println();
                }
            }

            if (p == '2') {
                for (int i = 0; i < d.length; i++) {
                    for (int t = 0; t < d[0].length; t++) {
                        if (i == 1 && t == 0) {
                            System.out.print(" ");
                        } else if (i == 3 && t == 2) {
                            System.out.print(" ");
                        } else System.out.print(d[i][t]);
                    }
                    System.out.println();
                }
            }

            if (p == '3') {
                for (int i = 0; i < d.length; i++) {
                    for (int t = 0; t < d[0].length; t++) {
                        if (i == 1 && t == 0) {
                            System.out.print(" ");
                        } else if (i == 3 && t == 0) {
                            System.out.print(" ");
                        } else System.out.print(d[i][t]);
                    }
                    System.out.println();
                }
            }

            if (p == '4') {
                for (int i = 0; i < d.length; i++) {
                    for (int t = 0; t < d[0].length; t++) {
                        if (i == 0 && t == 1) {
                            System.out.print(" ");
                        } else if (i == 3 && t == 0) {
                            System.out.print(" ");
                        } else if (i == 4 && t == 1) {
                            System.out.print(" ");
                        } else System.out.print(d[i][t]);
                    }
                    System.out.println();
                }
            }

            if (p == '5') {
                for (int i = 0; i < d.length; i++) {
                    for (int t = 0; t < d[0].length; t++) {
                        if (i == 1 && t == 2) {
                            System.out.print(" ");
                        } else if (i == 3 && t == 0) {
                            System.out.print(" ");
                        } else System.out.print(d[i][t]);
                    }
                    System.out.println();
                }
            }

            if (p == '6') {
                for (int i = 0; i < d.length; i++) {
                    for (int t = 0; t < d[0].length; t++) {
                        if (i == 1 && t == 2) {
                            System.out.print(" ");
                        } else System.out.print(d[i][t]);
                    }
                    System.out.println();
                }
            }

            if (p == '7') {
                for (int i = 0; i < d.length; i++) {
                    for (int t = 0; t < d[0].length; t++) {
                        if (i == 0 && t == 1) {
                            System.out.print(d[0][1]);
                        } else if (i == 1 && t == 2) {
                            System.out.print(d[1][2]);
                        } else if (i == 3 && t == 2) {
                            System.out.print(d[3][2]);
                        } else System.out.print("  ");
                    }
                    System.out.println();
                }
            }

            if (p == '8') {
                for (int i = 0; i < d.length; i++) {
                    for (int t = 0; t < d[0].length; t++) {
                        System.out.print(d[i][t]);
                    }
                    System.out.println();

                }
            }

            if (p == '9') {
                for (int i = 0; i < d.length; i++) {
                    for (int t = 0; t < d[0].length; t++) {
                        if (i == 3 && t == 0) {
                            System.out.print(" ");
                        } else System.out.print(d[i][t]);
                    }
                    System.out.println();
                }
            }


        }

	}

}
