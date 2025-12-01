
## Droid Workspace Overview

This workspace contains several Android projects, each organized as a standalone Gradle project. Below is a summary of each subproject and its structure:

### Projects

- **AlrtDialogeApp**
- **HardCodingComponents**
- **MyFirstApp**
- **MyRecyclerViewApp**
- **MySecondApp**
- **RecapProjectandSeekBar**

Each project contains:
- `build.gradle.kts` (Kotlin DSL build script)
- `gradle.properties` (Gradle configuration)
- `settings.gradle.kts` (Project settings)
- `app/` (Main application module)
	- `build.gradle.kts` (App module build script)
	- `proguard-rules.pro` (ProGuard configuration)
	- `src/`
		- `main/`
			- `AndroidManifest.xml` (App manifest)
			- `java/` (Source code)
			- `res/` (Resources: layouts, drawables, etc.)
		- `androidTest/` (Instrumentation tests)
		- `test/` (Unit tests)
	- `.gitignore` (Git ignore rules)
- `gradle/` (Gradle wrapper and version catalog)
	- `libs.versions.toml` (Dependency versions)
	- `wrapper/` (Gradle wrapper properties)
- `gradlew` / `gradlew.bat` (Gradle wrapper scripts)

---

## How to Build & Run

1. Open any subproject folder in Android Studio.
2. Use the Gradle wrapper (`./gradlew build`) to build the project.
3. Run or debug the app from Android Studio.

---

## Notes
- Each app is independent and can be built/run separately.
- All projects use Kotlin DSL for Gradle configuration.
- For more details, explore the `app/src/main/java` and `app/src/main/res` folders in each project.
