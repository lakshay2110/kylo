package com.thinkbiganalytics.kylo.catalog.file;

/*-
 * #%L
 * kylo-catalog-api
 * %%
 * Copyright (C) 2017 - 2018 ThinkBig Analytics
 * %%
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
 * #L%
 */

import org.apache.hadoop.fs.FileSystem;

import java.io.IOException;

import javax.annotation.Nonnull;

/**
 * Represents a function that performs an action on a {@link FileSystem} and returns a result.
 *
 * @param <R> type of result
 */
@FunctionalInterface
public interface FileSystemFunction<R> {

    R apply(@Nonnull FileSystem fileSystem) throws IOException;
}
