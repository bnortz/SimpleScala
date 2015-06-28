# SimpleScala

## Instructions

1. Fork and clone this repository
2. update, compile and run the test
3. Make a new branch on your local repository
4. To that branch, add the following changes
5. Create a main class which prints multiple HelloWorld greetings in different ways
6. Make a list of HelloWorld objects and use `.map()` on that list to set their volumes to `100`
7. commit your changes to the branch and push the branch to your fork
8. Open a `pull request` to this repository to add your changes to this branch.

## Notes:

To run `sbt`:

```bash

//The following is a sledgehammer to make sure your dependencies 
//are up-to-date, and recompile your code and finally run your tests

> sbt clean update compile test

```

If you just type `sbt` into the console, you get the sbt console.  This allows you to enter the above tasks one by one:

```bash
sbt 
[info] Loading global plugins from /Users/mechko/.sbt/0.13/plugins
[info] Set current project to SimpleScala (in build file:/Users/mechko/projects/SimpleScala/)
> clean
[success] Total time: 0 s, completed Jun 28, 2015 6:18:57 PM
> update
[info] Updating {file:/Users/mechko/projects/SimpleScala/}simplescala...
[info] Resolving jline#jline;2.12.1 ...
[info] Done updating.
[success] Total time: 1 s, completed Jun 28, 2015 6:19:00 PM
> compile
[info] Compiling 1 Scala source to /Users/mechko/projects/SimpleScala/target/scala-2.11/classes...
[success] Total time: 4 s, completed Jun 28, 2015 6:19:07 PM
> test
[info] Compiling 1 Scala source to /Users/mechko/projects/SimpleScala/target/scala-2.11/test-classes...
[info] HelloTest:
[info] A HelloWorld case class
[info] - should be instantiated
[info] Run completed in 405 milliseconds.
[info] Total number of tests run: 1
[info] Suites: completed 1, aborted 0
[info] Tests: succeeded 1, failed 0, canceled 0, ignored 0, pending 0
[info] All tests passed.
[success] Total time: 4 s, completed Jun 28, 2015 6:19:12 PM
> exit
```
