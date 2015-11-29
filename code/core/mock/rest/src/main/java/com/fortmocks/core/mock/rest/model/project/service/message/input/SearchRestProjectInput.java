/*
 * Copyright 2015 Karl Dahlgren
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.fortmocks.core.mock.rest.model.project.service.message.input;

import com.fortmocks.core.basis.model.Input;
import com.fortmocks.core.basis.model.SearchQuery;
import com.fortmocks.core.basis.model.validation.NotNull;
import com.fortmocks.core.mock.rest.model.project.dto.RestApplicationDto;

/**
 * @author Karl Dahlgren
 * @since 1.0
 */
public class SearchRestProjectInput implements Input {

    @NotNull
    private SearchQuery searchQuery;

    public SearchRestProjectInput(SearchQuery searchQuery) {
        this.searchQuery = searchQuery;
    }

    public SearchQuery getSearchQuery() {
        return searchQuery;
    }

    public void setSearchQuery(SearchQuery searchQuery) {
        this.searchQuery = searchQuery;
    }
}