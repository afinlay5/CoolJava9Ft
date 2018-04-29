/*
Copyright (C) 2018 Adrian D. Finlay. All rights reserved.

Licensed under the MIT License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    https://opensource.org/licenses/MIT

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER INCLUDING AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
==============================================================================
**/

package src.main.java;

import static java.lang.System.out;

public class Unicode8 {
	public static void main (String [] args) {
		String unicodeMessage1 = "\uD63E\uD013";
		String unicodeMessage2 = "\uD63E\uD081";
		String unicodeMessage3 = "\uD63E\uD011";
		String unicodeMessage4 = "\uD63E\uD018";
		String unicodeMessage5 = "\uD63E\uD084";
		try {
			java.io.PrintStream out = new java.io.PrintStream(System.out, true, "UTF-8");
			out.println("Unicode 8.0--  \"NERD FACE\":  \t\t" + unicodeMessage1);
			out.println("Unicode 8.0--  \"LION FACE\":  \t\t" + unicodeMessage2);
			out.println("Unicode 8.0--  \"MONEY-MOUTH FACE\":  \t" + unicodeMessage3);
			out.println("Unicode 8.0--  \"SIGN OF THE HORNS\":  \t" + unicodeMessage4);
			out.println("Unicode 8.0--  \"UNICORN FACE\":  \t" + unicodeMessage5);
		} catch (java.io.UnsupportedEncodingException uee) { out.println(uee); }
	}
}
