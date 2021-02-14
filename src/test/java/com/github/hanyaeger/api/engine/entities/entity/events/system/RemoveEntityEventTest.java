package com.github.hanyaeger.api.engine.entities.entity.events.system;

import com.github.hanyaeger.api.engine.entities.entity.Removable;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class RemoveEntityEventTest {

    @Test
    void correctSourceSet() {
        // Arrange
        var removeable = Mockito.mock(Removable.class);
        var event = new RemoveEntityEvent(removeable);

        // Act
        var source = event.getSource();

        // Assert
        Assertions.assertSame(removeable, source);
    }
}
