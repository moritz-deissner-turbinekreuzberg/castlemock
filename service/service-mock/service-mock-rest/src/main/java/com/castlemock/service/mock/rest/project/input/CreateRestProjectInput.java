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

package com.castlemock.service.mock.rest.project.input;

import com.castlemock.model.core.Input;
import com.castlemock.model.core.validation.NotNull;
import com.castlemock.model.mock.rest.domain.RestProject;

import java.util.Objects;

/**
 * @author Karl Dahlgren
 * @since 1.0
 */
public final class CreateRestProjectInput implements Input {

    @NotNull
    private final RestProject restProject;

    private CreateRestProjectInput(final Builder builder) {
        this.restProject = Objects.requireNonNull(builder.restProject);
    }

    public RestProject getRestProject() {
        return restProject;
    }

    public static Builder builder(){
        return new Builder();
    }

    public static final class Builder {

        private RestProject restProject;

        public Builder restProject(final RestProject restProject){
            this.restProject = restProject;
            return this;
        }

        public CreateRestProjectInput build(){
            return new CreateRestProjectInput(this);
        }

    }

}
