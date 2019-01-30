/*
 * Copyright 2016-2017 Red Hat, Inc, and individual contributors.
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

package io.openshift.booster;

import org.infinispan.spring.embedded.provider.SpringEmbeddedCacheManager;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;

import static org.assertj.core.api.Assertions.assertThat;

public class InfinispanEmbeddedCacheAutoconfiguredTest extends AbstractSpringCachingTest{

    @Autowired
    private CacheManager cacheManager;

    @Test
    public void configuredCacheManagerIsInfinispanEmbeddedCacheManager() {
        assertThat(cacheManager).isNotNull().isInstanceOf(SpringEmbeddedCacheManager.class);
    }
}
