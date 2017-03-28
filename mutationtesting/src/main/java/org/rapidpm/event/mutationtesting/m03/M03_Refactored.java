package org.rapidpm.event.mutationtesting.m03;

/**
 * Copyright (C) 2017 RapidPM - Sven Ruppert
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Created by Sven Ruppert - RapidPM - Team on 28.03.17.
 */
public class M03_Refactored implements M03 {

  public String[] discardCommonPrefix(String a, String b) {
    final String[] ret = new String[2];
    int l;

    if (a.length() < b.length()) {
      l = a.length();
    } else {
      l = b.length();
    }

    int position = 0;
    //until first character differs
    for (; position < l; position++) {
      final char charA = a.charAt(position);
      final char charB = b.charAt(position);
      if (charA != charB) {
        break;
      }
    }

    // remaining filename parts
    if (position >= a.length()) {
      ret[0] = "";
    } else {
      ret[0] = a.substring(position);
    }
    if (position >= b.length()) {
      ret[1] = "";
    } else {
      ret[1] = b.substring(position);
    }
    return ret;
  }

}
