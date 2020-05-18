A [Giter8][g8] template for sbt/scala projects with OpenJFX. This also includes a sbt custom task `release` that builds an release package composed of your application jar, minimized JRE, and launch script.

```
sbt new  Biacco42/scala-jfx-crossplatform.g8
```

To release/packaging the app, use `release` task in sbt shell. It will make a package directory in the `release` directory that includes a launch script named same as the project name.

Template license
----------------
Written in 2020 by Biacco42.

To the extent possible under law, the author(s) have dedicated all copyright and related
and neighboring rights to this template to the public domain worldwide.
This template is distributed without any warranty. See <http://creativecommons.org/publicdomain/zero/1.0/>.

[g8]: http://www.foundweekends.org/giter8/
