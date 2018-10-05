package nl.han.ica.waterworld.entities.game;

import nl.han.ica.yaeger.engine.entities.entity.Position;
import nl.han.ica.yaeger.engine.entities.entity.sprites.BoundingBox;
import nl.han.ica.yaeger.engine.entities.entity.sprites.Movement;
import nl.han.ica.yaeger.engine.entities.enumerations.SceneBorder;
import nl.han.ica.yaeger.engine.entities.entity.Collider;
import nl.han.ica.yaeger.engine.entities.entity.sprites.UpdatableSpriteEntity;

public class Swordfish extends UpdatableSpriteEntity implements Collider {

    private static final String IMAGES_SWORDFISH_PNG = "images/swordfish.png";

    public Swordfish(final Position position) {
        super(position, IMAGES_SWORDFISH_PNG, new BoundingBox(300, 108), 1, new Movement(270, 2));
    }

    @Override
    protected void notifyBoundaryCrossing(SceneBorder border) {
        if (border.equals(SceneBorder.LEFT)) {
            setLocation(getSceneWidth(), getY());
        }
    }
}