# ls4inform6
## Language Server for the Inform 6 programming language code 
(XText powered Language Server supportive of any Editor with LSP functionality)

Features: 
  * Helps out with checking the syntax at object and function level. 
  * Clickable Cross-references between files (for class and object declarations).
  * Outline in all editors supporting the Language Server Protocol

NOTE: Library folders (or any unexplicit include directive) will need to be referenced via comments with compiler directive *include_path* or *language* at the top of the source file, the same way done in inform source files, e.g:

!% +include_path=../../lib/,/usr/local/share/inform/lib/

As seen above, the paths can both be relative to the current file or absolute and separated by commas. (No spacing allowed though)


## Usage

For use within _eclipse_, just go to the market place and search for Inform 6 Code assister and install the feature.

For usage with _visual studio code_, the _inf6langtools_ extension is downloadable as an extension.  So to install it, just search for inf6langtools in the extension pane. To build it manually you need compile this repostiory first with 'mvn install'. This will create the artifact for the language server (served as a fat-jar) in the xtext4Inform6.ide/target folder (ending -ls.jar). This jar needs to be placed within the inf6langtools/launcher folder. Then clone the inf6langtools repo (https://github.com/toerob/inf6langtools) and add the jar in that folder and then run the extension from vscode. 

For other editors supporting LSP (https://microsoft.github.io/language-server-protocol/implementors/tools/)
The language server jar can be placed


## Disclaimer

This language server is by no means feature complete yet. It will need tons of improvement but it may already be useful to someone and is therefore released in an unfinished state.

## License and credit
The language Server for Inform 6 is powered by the XText framework (https://www.eclipse.org/Xtext/index.html) licensed under the EPL 2.0 license (https://www.eclipse.org/legal/epl-2.0/). 


## Collaboration

If you like to help out bringing more functionality to this plugin please contact me at tomaserikoberg@gmail.com
