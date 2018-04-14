SimplePlugins
=============

Create simple minecraft *mods* (Plugins) without setting up a complete
forge development environment.

Usage
-----

Clone the blueprint repo version matching the version of SimplePlugins
you want to use or download the .zip-Archive of it and extract it (You
can rename the directory containing the extracted files to anything you
want). The link to the correct blueprint version and the download of the
.zip-Archive can be found alongside every
`release <https://github.com/liketechnik/simplePlugins/releases>`_ of
SimplePlugins.

Inside the directory, run ``gradlew setupDecompWorkspace`` to initialize
forge. Then, depending on the IDE you use, run ``gradlew eclipse`` or
``gradlew idea genIntellijRuns``.

You can now begin creating your plugin:

-  Adjust the build.gradle (``group`` and ``archiveBaseName`` ) to your
   needs.
-  Either delete and start from scratch or rename the default plugin
   class
-  Enter the name into the manifest attributes

Look at the `documentation <https://simpleplugins.readthedocs.io/en/latest>`_
to get an idea of how achieve certain things.

Bug Reports
-----------

Please report any and all issues you encounter while using this mod on
the `issue
tracker <https://github.com/liketechnik/simplePlugins/issues>`_. It is
important to include the SimplePlugins, Minecraft and Forge version you
are using, in your reports/ideas/suggestions.

Documentation
-------------

Many things are already documented right in the source code and the javadoc. For all other 
things and further research, the documentation of SimplePlugins is available at https://simpleplugins.readthedocs.io/en/latest.

Development
-----------

Help with the development is highly appreciated, e. g. pull requests,
writing missing documentation or adding ideas.

SimplePlugins's source code is hosted on GitHub at https://github.com/liketechnik/SimplePlugins.

If you want to work on SimplePlugins, clone the repository from github and
initialize the forge modding environment as described above.

Versioning scheme
-----------------

-  The first number stands for the minecraft version:
   The first version 1.x was released for MC version 1.12, so version
   3.x would refer to MC Version 1.14.
-  The second number stands for added features:
   For every added feature/release, the number gets increased, i. e the
   current version is x.0 and a new feature is added, the new version
   would be x.1.
-  The third number gets increased for every forge update (inside one MC
   version).
-  The number after the bullet point gets increased after bugfixes.
-  The numbers can only increase for the same MC version, after a new MC
   Version, all other numbers are reset to 0

Acknowledgements
----------------

| Thanks to the `Forge project <http://files.minecraftforge.net/>`_ for
  creating a great framework for modding minecraft. Without forge, this
  would not be possible.
| I had the idea for this mod after I met the `Canary
  project <https://github.com/CanaryModTeam/CanaryMod>`_, a framework
  for creating server side plugins for minecraft. Sadly, the latest
  version was made for the minecraft version 1.8, which was one of the
  reasons for me to start this project.
  
  
  
