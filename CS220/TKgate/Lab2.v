//: version "2.1"
//: property encoding = "utf-8"
//: property locale = "en"
//: property prefix = "_GG"
//: property timingViolationMode = 2
//: property initTime = "0 ns"

`timescale 1ns/1ns

//: /netlistBegin main
module main;    //: root_module
reg w6;    //: /sn:0 {0}(170,225)(272,225)(272,166)(306,166){1}
reg w4;    //: /sn:0 {0}(298,124)(218,124)(218,168)(170,168){1}
reg w10;    //: /sn:0 {0}(161,520)(263,520)(263,171)(306,171){1}
reg w11;    //: /sn:0 {0}(163,470)(242,470)(242,129)(298,129){1}
wire w13;    //: /sn:0 {0}(458,142)(536,142)(536,116){1}
wire w12;    //: /sn:0 {0}(437,144)(392,144)(392,169)(327,169){1}
wire w9;    //: /sn:0 {0}(319,127)(369,127)(369,139)(437,139){1}
//: enddecls

  _GGNXOR2 #(6) g8 (.I0(w4), .I1(w11), .Z(w9));   //: @(309,127) /sn:0 /w:[ 0 1 0 ]
  //: SWITCH g10 (w11) @(146,463) /sn:0 /w:[ 0 ] /st:0 /dn:1
  //: SWITCH g9 (w10) @(144,520) /sn:0 /w:[ 0 ] /st:1 /dn:1
  _GGAND2 #(6) g12 (.I0(w9), .I1(w12), .Z(w13));   //: @(448,142) /sn:0 /w:[ 1 0 0 ]
  _GGNXOR2 #(6) g14 (.I0(w6), .I1(w10), .Z(w12));   //: @(317,169) /sn:0 /w:[ 1 1 1 ]
  //: SWITCH g11 (w6) @(153,225) /sn:0 /w:[ 0 ] /st:0 /dn:1
  //: SWITCH g15 (w4) @(153,168) /sn:0 /w:[ 1 ] /st:0 /dn:1
  //: LED g13 (w13) @(536,109) /sn:0 /w:[ 1 ] /type:0

endmodule
//: /netlistEnd

