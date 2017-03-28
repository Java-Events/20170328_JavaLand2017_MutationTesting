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
public interface M03 {

  /**
   * Discards the common prefix of two files ("" if not existent) and returns
   * the remaining suffices of both files).
   *
   * @param a name of the first file
   * @param b name of the second file
   *
   * @return array containing the remaining suffix of the first file as first
   * element<br>
   * and the remaining suffix of the second file as second element<br>
   * (both file names if no common prefix exists)
   * <p>
   * 123abc , 12d -- [3abc] [d] - remove prefix 12
   * 123abc , 12 -- [3abc] [] - remove prefix 12
   */
  String[] discardCommonPrefix(String a, String b);
}
