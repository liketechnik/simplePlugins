Setup SimplePlugins
===================

In this part, you will learn how to setup your plugin. When you finished the setup, you can start looking at the other parts of the 
tutorial and play with MC.

Setup your plugin
-----------------

First download the blueprint .zip-Archive, which is marked with a ``b`` in front of the version, for your preferred version
from the `release page <https://github.com/liketechnik/simplePlugins/releases>`_ at github. 
Unpack the archive to a location where you want to work at your plugin, this place is going to be referred to as the *project directory*.
You can rename the folder containing all the stuff to whatever you want to call your plugin.

Next head over the `forge setup tutorial <https://mcforge.readthedocs.io/en/latest/gettingstarted/#from-zero-to-modding>`_ and step over steps 1-3, 
because everything is ready to start with step 4 in your project directory. After you finished step 6, your ready to start customizing your 
plugin.

Make it yours
---------------------

Now you can start making your plugin truly yours:

1.  First open the ``build.gradle`` file, this file contains information such as the name of your plugin. 
    Change the values of the lines ``group`` and ``archivesBaseName`` to your liking (they can both have the same name), in our case this name will be
    ``demoPlugin``. Then choose a name for the main class of the plugin, it is recommended to choose the same name you just used, so our main class will
    be called ``DemoPlugin``. Your ``build.gradle`` file will then roughly look like this (the lines you should have changed are highlighted):

.. code-block:: groovy
    :caption: build.gradle
    :emphasize-lines: 15, 16, 21    

    buildscript {
    repositories {
        jcenter()
        maven { url = "http://files.minecraftforge.net/maven" }
    }
    dependencies {
        classpath 'net.minecraftforge.gradle:ForgeGradle:2.3-SNAPSHOT'
    }
    }
    apply plugin: 'net.minecraftforge.gradle.forge'
    //Only edit below this line, the above code adds and enables the necessary things for Forge to be setup.


    version = "1.0"
    group = "demoPlugin" // http://maven.apache.org/guides/mini/guide-naming-conventions.html
    archivesBaseName = "demoPlugin"

    jar {
        manifest {
            attributes(
                    'Main-Class': 'DemoPlugin'
            )
        }
    }

    sourceCompatibility = targetCompatibility = '1.8' // Need this here so eclipse task generates correctly.
    compileJava {
        sourceCompatibility = targetCompatibility = '1.8'
    }

    minecraft {
        version = "1.12.2-14.23.2.2618"
        runDir = "run"
    
        // the mappings can be changed at any time, and must be in the following format.
        // snapshot_YYYYMMDD   snapshot are built nightly.
        // stable_#            stables are built at the discretion of the MCP team.
        // Use non-default mappings at your own risk. they may not always work.
        // simply re-run your setup task after changing the mappings to update your workspace.
        mappings = "snapshot_20171003"
        // makeObfSourceJar = false // an Srg named sources jar is made by default. uncomment this to disable.
    }

2. Then go into the ``src/main/java`` folder where all your classes will reside. It contains a default class you can rename to the class name you chose 
   in step 1. Then open up the file and change the class name and modify the string passed to the constructor of the superclass too.
   (You can also edit the author and date information of the javadoc or delete it, if you want).
   After this, your main class should look like this (changes are highlighted again):

.. code-block:: java
    :caption: src/main/java/DemoPlugin.java
    :emphasize-lines: 8, 10, 11

    import simplePlugins.plugins.api.Plugin;

    /**
    * @author tutorial
    * @version 1.0
    * @date 18 of Februar 2018
    */
    public class DemoPlugin extends Plugin {
    
        public DemoPlugin() {
            super("DemoPlugin");
        }
    }   
    

Now you're ready to create your first plugin. You have multiple options what you can start with: 

* Create your first commands.
* React to events and modify the game.

