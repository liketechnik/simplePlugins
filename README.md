# SimplePlugins
Create simple minecraft _mods_ without setting up a complete forge development environment.

## Usage
Clone the blueprint repo version matching the version of SimplePlugins you want to use or download the .zip-Archive of it and extract it (You can rename the directory containing the extracted files to anything you want). The link to the correct blueprint version and the download of the .zip-Archive can be found alongside every release of SimplePlugins.

Inside the directory, run ```gradlew setupDecompWorkspace``` to initialize forge. Then, depending on the IDE you use, run ```gradlew eclipse``` or ```gradlew idea genIntellijRuns```.

You can now begin creating your plugin:

- Adjust the build.gradle (```group``` and ```archiveBaseName``` ) to your needs.
- Either delete and start from scratch or rename the default plugin class
- Enter the name into the manifest attributes

Look at the [wiki][] to get an idea of how achieve certain things.

## Bug Reports
Please report any and all issues you encounter while using this mod on the issue tracker. It is important to include the SimplePlugins, Minecraft and Forge version you are using, in your reports/ideas/suggestions.

## Documentation
Most things are either documented right inside the source code or are already documented by forge. For all other things, you can take a look into the wiki.

## Development
Help with the development is highly appreciated, e. g. pull requests, writing missing documentation or adding ideas.

If you want to work on SimplePlugins, clone the repository and initialize the forge modding environment as described above.

## Versioning scheme
- The first number stands for the minecraft version:
    The first version 1.x was released for MC version 1.12, so version 3.x would refer to MC Version 1.14.
- The second number stands for added features:
    For every added feature/release, the number gets increased, i. e the current version is x.0 and a new feature is added, the new version would be x.1.
- The third number gets increased for every forge update (inside one MC version).
- The number after the bullet point gets increased after bugfixes.
- The numbers can only increase for the same MC version, after a new MC Version, all other numbers are reset to 0
