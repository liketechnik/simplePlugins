.. java:import:: net.minecraft.entity Entity

.. java:import:: net.minecraft.util.math BlockPos

.. java:import:: net.minecraft.world World

WorldWrapper
============

.. java:package:: simplePlugins.plugins.api.wrapper
   :noindex:

.. java:type:: public class WorldWrapper

   :author: Florian Warzecha

Methods
-------
spawnEntity
^^^^^^^^^^^

.. java:method:: public static boolean spawnEntity(World world, Entity entity, double x, double y, double z)
   :outertype: WorldWrapper

   Spawns an entity at a given position in the world. The vanilla entity classes are contained in the \ :java:ref:`net.minecraft.entity`\  package. To spawn an entity, for example a chicken, create a new instance of this entity, and pass it together with the world it should spawn in and its position to this method.

   :param world: The world the entity is spawned in.
   :param entity: The entity object that gets spawned. Should be a newly created object everytime.
   :param x: The x coordinate of the spawn position.
   :param y: The y coordinate of the spawn position.
   :param z: The z coordinate of the spawn position.
   :return: If the spawn has been successful.

   **See also:** :java:ref:`World.spawnEntity(Entity)`

spawnEntity
^^^^^^^^^^^

.. java:method:: public static boolean spawnEntity(World world, Entity entity, BlockPos pos)
   :outertype: WorldWrapper

   Spawns an entity at a given position in the world. The vanilla entity classes are contained in the \ :java:ref:`net.minecraft.entity`\  package. To spawn an entity, for example a chicken, create a new instance of this entity, and pass it together with the world it should spawn in and its position to this method.

   :param world: The world the entity is spawned in.
   :param entity: The entity object that gets spawned. Should be a newly created object everytime.
   :param pos: The position where the entity will spawn.
   :return: If the spawn has been successful.

   **See also:** :java:ref:`World.spawnEntity(Entity)`, :java:ref:`.spawnEntity(World,Entity,double,double,double)`

