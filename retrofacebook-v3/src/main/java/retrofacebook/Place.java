/*
 * Copyright (C) 2015 8tory, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package retrofacebook;

import auto.json.AutoJson;
import android.support.annotation.Nullable;

@AutoJson
public abstract class Place {
    @Nullable
    @AutoJson.Field
    public abstract String street();
    @Nullable
    @AutoJson.Field
    public abstract String city();
    @Nullable
    @AutoJson.Field
    public abstract String state();
    @Nullable
    @AutoJson.Field
    public abstract String country();
    @Nullable
    @AutoJson.Field
    public abstract Integer zip();
    @Nullable
    @AutoJson.Field
    public abstract Double latitude();
    @Nullable
    @AutoJson.Field
    public abstract Double longitude();
    @Nullable
    @AutoJson.Field
    public abstract String id();
    @Nullable
    @AutoJson.Field
    public abstract String name();

    @AutoJson.Builder
    public abstract static class Builder {
        public abstract Builder street(String x);
        public abstract Builder city(String x);
        public abstract Builder state(String x);
        public abstract Builder country(String x);
        public abstract Builder zip(Integer x);
        public abstract Builder latitude(Double x);
        public abstract Builder longitude(Double x);
        public abstract Builder id(String x);
        public abstract Builder name(String x);

        public abstract Place build();
    }

    public static Builder builder() {
        return new AutoJson_Place.Builder();
    }
}
