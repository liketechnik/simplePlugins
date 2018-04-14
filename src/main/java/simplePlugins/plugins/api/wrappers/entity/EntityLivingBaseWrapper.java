package simplePlugins.plugins.api.wrappers.entity;

import net.minecraft.entity.EntityLivingBase;

/**
 * @author Florian Warzecha
 * @version 1.0
 * @date 06 of April 2018
 */
public class EntityLivingBaseWrapper extends EntityWrapper {
    
    private EntityLivingBase entityLivingBase;
    
    public EntityLivingBaseWrapper(EntityLivingBase entity) {
        super(entity);
        this.entityLivingBase = entity;
    }
    
    public void addHealth(float amount) {
        float health = this.entityLivingBase.getHealth() + amount;
        this.entityLivingBase.setHealth(health);
    }
    
    public void kill() {
        this.entityLivingBase.setHealth(0);
    }
    
    @Override
    public EntityLivingBase getUnwrapped() {
        return this.entityLivingBase;
    }
}
