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
    int minLenght;

    minLenght = Math.min(a.length(), b.length());

    int position = 0;
    //until first character differs
    for (; position < minLenght; position++) {
      final char charA = a.charAt(position);
      final char charB = b.charAt(position);
      if (charA != charB) {
        break;
      }
    }
    // remaining filename parts
    ret[0] = position >= a.length() ? "" : a.substring(position);
    ret[1] = position >= b.length() ? "" : b.substring(position);
    return ret;
  }

}
