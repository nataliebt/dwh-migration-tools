/*
 * Copyright 2022-2024 Google LLC
 * Copyright 2013-2021 CompilerWorks
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
package com.google.edwmigration.dumper.application.dumper.utils;

import java.time.Clock;
import java.time.format.DateTimeFormatter;

public class ArchiveNameUtil {

  /**
   * Generate the archive file name that includes creation time. Typically this is used with a logs
   * connector when dumping for Assessment.
   *
   * @param name The name of the connector.
   * @param suffix Connector-specific suffix such as "metadata" or "logs".
   * @param clock The Clock instance to provide the date.
   * @return Full name for the .zip archive.
   */
  public static String getFileNameWithTimestamp(String name, String suffix, Clock clock) {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd'T'HHmmss");
    String timeSuffix = formatter.withZone(clock.getZone()).format(clock.instant());
    return formatFileName(name, suffix + "-" + timeSuffix);
  }

  /**
   * Generate the archive file name, but do not include creation time. This is the most common case,
   * dumping logs for assessment being a known exception.
   *
   * @param name The name of the connector.
   * @param suffix Connector-specific suffix such as "metadata" or "logs".
   * @return Full name for the .zip archive.
   */
  public static String getFileName(String name, String suffix) {
    return formatFileName(name, suffix);
  }

  private static String formatFileName(String name, String suffix) {
    String nameWithOptionalSuffix = name + (suffix.isEmpty() ? "" : "-" + suffix);
    return String.format("dwh-migration-%s.zip", nameWithOptionalSuffix);
  }

  private ArchiveNameUtil() {}
}
