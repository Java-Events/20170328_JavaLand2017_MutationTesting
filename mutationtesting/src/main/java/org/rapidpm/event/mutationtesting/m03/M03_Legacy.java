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
public class M03_Legacy implements M03 {

  public String[] discardCommonPrefix(String a, String b) {
    String[] ret = {a, b};
    int l = a.length() < b.length() ? a.length() : b.length();
    for (int i = 0; i < l; i++) {
      if (a.charAt(i) == b.charAt(i)) {
        if (i + 1 < l) {
          ret[0] = a.substring(i + 1);
          ret[1] = b.substring(i + 1);
        } else {
          if (a.length() < b.length()) {
            ret[0] = "";
            ret[1] = b.substring(i + 1);
          }
          if (a.length() == b.length()) {
            ret[0] = "";
            ret[1] = "";
          }
          if (a.length() > b.length()) {
            ret[0] = a.substring(i + 1);
            ret[1] = "";
          }
        }
      } else
        break;
    }
    return ret;
  }
}
