package junit.org.rapidpm.event.mutationtesting.m01;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.rapidpm.event.mutationtesting.m01.M01;

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
public class M01Test {

  @Test
  @Ignore
  public void add001_001() throws Exception {
    Assert.assertEquals(10, new M01().add001(0, 0));
  }

  @Test
  public void add001_002() throws Exception {
    Assert.assertEquals(12, new M01().add001(1,1));
  }

  @Test
  public void add001_003() throws Exception {
    Assert.assertEquals(8, new M01().add001(-1,-1));
  }

  @Test
  public void add002_001() throws Exception {
    Assert.assertEquals(-10, new M01().add002(0,0));
  }
  @Test
  public void add002_002() throws Exception {
    Assert.assertEquals(12, new M01().add002(1,1));
  }

}
