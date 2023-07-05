package com.adha.dhp.loancalculator.config;

import org.junit.jupiter.api.Test;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

class RedisConfigTest {

    @Test
    void testRedisTemplate() {
        RedisConnectionFactory connectionFactory = mock(RedisConnectionFactory.class);

        RedisConfig redisConfig = new RedisConfig();

        RedisTemplate<String, Object> template = redisConfig.redisTemplate(connectionFactory);

        assertEquals(connectionFactory, template.getConnectionFactory());

        RedisSerializer<String> expectedKeySerializer = new StringRedisSerializer();
        assertEquals(expectedKeySerializer.getClass(), template.getKeySerializer().getClass());
        assertEquals(expectedKeySerializer.getClass(), template.getHashKeySerializer().getClass());

        RedisSerializer<Object> expectedValueSerializer = new Jackson2JsonRedisSerializer<>(Object.class);
        assertEquals(expectedValueSerializer.getClass(), template.getValueSerializer().getClass());
        assertEquals(expectedValueSerializer.getClass(), template.getHashValueSerializer().getClass());

    }
}
