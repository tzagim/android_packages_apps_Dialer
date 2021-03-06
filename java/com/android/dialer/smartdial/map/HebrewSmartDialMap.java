/*
 * Copyright (C) 2020 The Android Open Source Project
 * And Tzagim 2021 can be used for free while giving credit
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.dialer.smartdial.map;

import android.support.v4.util.SimpleArrayMap;
import com.android.dialer.dialpadview.DialpadCharMappings;
import com.google.common.base.Optional;

/** A {@link SmartDialMap} for the Hebrew alphabet. */
@SuppressWarnings("Guava")
final class HebrewSmartDialMap extends SmartDialMap {

  private static HebrewSmartDialMap instance;

  static HebrewSmartDialMap getInstance() {
    if (instance == null) {
      instance = new HebrewSmartDialMap();
    }

    return instance;
  }

  private HebrewSmartDialMap() {}

  @Override
  Optional<Character> normalizeCharacter(char ch) {
    ch = Character.toLowerCase(ch);
    return isValidDialpadAlphabeticChar(ch) ? Optional.of(ch) : Optional.absent();
  }

  @Override
  SimpleArrayMap<Character, Character> getCharToKeyMap() {
    return DialpadCharMappings.getCharToKeyMap("heb");
  }
}
