# Keep model classes
-keep class com.yourpackage.model.** { *; }

# Keep Retrofit interfaces
-keep interface com.yourpackage.api.** { *; }

# Gson
-keep class com.google.gson.** { *; }

# AndroidX
-dontwarn androidx.**
