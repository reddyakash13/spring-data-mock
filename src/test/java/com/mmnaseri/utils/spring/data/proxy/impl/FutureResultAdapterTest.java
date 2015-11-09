package com.mmnaseri.utils.spring.data.proxy.impl;

import com.mmnaseri.utils.spring.data.domain.impl.ImmutableInvocation;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.Future;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

/**
 * @author Mohammad Milad Naseri (m.m.naseri@gmail.com)
 * @since 1.0 (10/5/15)
 */
public class FutureResultAdapterTest {

    private interface Sample {

        Future findFuture();

    }

    @Test
    public void testAdapting() throws Exception {
        final FutureResultAdapter adapter = new FutureResultAdapter();
        final Future<?> value = adapter.adapt(new ImmutableInvocation(Sample.class.getMethod("findFuture"), null), Arrays.asList(1, 2, 3, 4));
        assertThat(value, is(notNullValue()));
        assertThat(value.get(), is(instanceOf((Class) Collection.class)));
        final Collection<?> collection = (Collection<?>) value.get();
        assertThat(collection, hasSize(4));
        assertThat(collection, containsInAnyOrder((Object) 1, 2, 3, 4));
    }

}