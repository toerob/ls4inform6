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


## Installation

* Install the latest eclipse version 
* Choose help/install new software
* Add update site: https://toerob.github.io/ls4inform-update-site/
* Select the ls4inform6 feature in the list and complete the installation
* Start eclipse and create or open an inform file (use extension .h or .inf)
* When asked if you want to open the file as a xtext editor choose yes.
(If needs be: manually choose the editor by right click in the text area and select "Open with" and choose "Inform 6 Editor")

For other editors supporting LSP (https://microsoft.github.io/language-server-protocol/implementors/tools/)
The language server jar can executed from any client extension. 

At the present stage I provide only one extension available for _visual studio code_ at:
https://github.com/toerob/inf6langtools


## Disclaimer

This language server is by no means feature complete yet. It will need tons of improvement but it may already be useful to someone and is therefore released in an unfinished state.

## License and credit
The language Server for Inform 6 is powered by the XText framework (https://www.eclipse.org/Xtext/index.html) licensed under the EPL 2.0 license (https://www.eclipse.org/legal/epl-2.0/). 


## Collaboration

If you like to help out bringing more functionality to this plugin please contact me at tomaserikoberg@gmail.com
