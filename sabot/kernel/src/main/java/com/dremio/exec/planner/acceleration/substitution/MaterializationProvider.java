/*
 * Copyright (C) 2017-2019 Dremio Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.dremio.exec.planner.acceleration.substitution;

import java.util.List;

import com.dremio.exec.planner.acceleration.DremioMaterialization;

/**
 * Provides a list of materializations for {@link SubstitutionProvider}
 */
public interface MaterializationProvider {

  /**
   * Returns list of materializations that provider considers for substitution.
   *
   */
  List<DremioMaterialization> getMaterializations();

}
