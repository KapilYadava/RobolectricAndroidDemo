# RobolectricAndroidDemo

This example is designed to understand 
* Use of robolectric testing framework (no need device to run these test)
* Use of ActivityTestRule (test which runs on device or emulator)


Pure unit tests. 
I try to make as much code as possible fully independent of Android APIs, and then use "pure" unit tests which can run on any JVM. These tests are the fastest, and it helps keep code that has no need to be Android-specific portable.

Robolectric-supported unit tests. 
Where my code has only small dependencies on Android APIs, that can be satisfied by Robolectric shadows, I test it with Robolectric. There is a little more setup time for Robolectric compared to pure tests, but it's still faster than starting/running on an emulator.

Android framework tests. 
Where Robolectric doesn't cut it - either because the shadows don't exist, or because I'm heavily using Android APIs (and therefore want to test against the Real Thing) - I write test that run on the emulator/device with the default framework.
