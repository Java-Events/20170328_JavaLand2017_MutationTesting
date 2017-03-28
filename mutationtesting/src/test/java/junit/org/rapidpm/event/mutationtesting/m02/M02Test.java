package junit.org.rapidpm.event.mutationtesting.m02;

import org.junit.Assert;
import org.junit.Test;
import org.rapidpm.event.mutationtesting.m02.M02;

import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.*;

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
public class M02Test {


  @Test
  public void test001() throws Exception {
    Assert.assertEquals(-2, new M02().doWork(1,1));
  }

  @Test
  public void test002() throws Exception {
    Assert.assertEquals(4, new M02().doWork(2,2));
  }

}
