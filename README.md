# MAD Practical 3 – Implicit & Explicit Intent

## 📱 Mobile Application Development

This practical demonstrates the use of **Implicit Intent and Explicit Intent** in Android applications using Kotlin.

## 🎯 Aim

Create an Android application that demonstrates **Implicit Intent and Explicit Intent** for performing different actions such as making a phone call, opening a URL, viewing call logs, opening the gallery, setting an alarm, opening the camera, and navigating to another Activity.

---

# 📚 Practical Description

## 1. Make Call to Specific Number

Uses an Intent with the `tel:` URI scheme to open the phone application with a specific phone number.

Example:

```kotlin
val intent = Intent(Intent.ACTION_DIAL)
intent.data = Uri.parse("tel:1234567890")
startActivity(intent)
```

---

## 2. Open Specific URL

Uses an **Implicit Intent** to open a specified website in a web browser.

Example:

```kotlin
val intent = Intent(Intent.ACTION_VIEW)
intent.data = Uri.parse("https://www.google.com")
startActivity(intent)
```

---

## 3. Open Call Log

Uses an Intent to open the device's call history.

Example:

```kotlin
val intent = Intent(Intent.ACTION_VIEW)
intent.type = CallLog.Calls.CONTENT_TYPE
startActivity(intent)
```

---

## 4. Open Gallery

Uses an Intent to open the device gallery and select an image.

Example:

```kotlin
val intent = Intent(Intent.ACTION_GET_CONTENT)
intent.type = "image/*"
startActivity(intent)
```

---

## 5. Set Alarm

Uses an Intent to open the device's alarm application.

Example:

```kotlin
val intent = Intent(AlarmClock.ACTION_SET_ALARM)
startActivity(intent)
```

---

## 6. Open Camera

Uses an Intent to launch the device camera application.

Example:

```kotlin
val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
startActivity(intent)
```

---

## 7. Open Login Activity

Uses an **Explicit Intent** to navigate from one Activity to another Activity within the same application.

Example:

```kotlin
val intent = Intent(this, LoginActivity::class.java)
startActivity(intent)
```

---

# 🔗 Intent

An **Intent** is a messaging object used to request an action from another Android component.

It can be used to:

- Start another Activity
- Open a web page
- Open the camera
- Open the gallery
- Make a phone call
- Open system applications
- Pass data between Activities

---

# 🔄 Types of Intent

## 1. Explicit Intent

An Explicit Intent specifies the exact component that should be started.

Example:

```kotlin
val intent = Intent(this, LoginActivity::class.java)
startActivity(intent)
```

It is commonly used to navigate between Activities within the same application.

## 2. Implicit Intent

An Implicit Intent specifies an action without specifying the exact component that should perform it.

Example:

```kotlin
val intent = Intent(Intent.ACTION_VIEW)
intent.data = Uri.parse("https://www.google.com")
startActivity(intent)
```

Android finds an appropriate application to handle the requested action.

---

# ⚙️ Intent Actions

This practical demonstrates several common Intent actions:

| Action | Purpose |
|---|---|
| `ACTION_DIAL` | Open phone dialer |
| `ACTION_VIEW` | View/open content |
| `ACTION_GET_CONTENT` | Select content such as images |
| `ACTION_SET_ALARM` | Set an alarm |
| `ACTION_IMAGE_CAPTURE` | Open camera |

---

# 🔗 Intent.setData()

`setData()` is used to specify the data that an Intent should operate on.

Example:

```kotlin
intent.setData(Uri.parse("tel:1234567890"))
```

It is commonly used with:

- `tel:`
- `https://`
- Other URI schemes

---

# 📄 Intent.setType()

`setType()` specifies the MIME type of the data that an Intent should handle.

Example:

```kotlin
intent.setType("image/*")
```

This tells Android that the application is looking for image files.

---

# 📱 Uri.parse()

`Uri.parse()` converts a string into a `Uri` object.

Example:

```kotlin
Uri.parse("https://www.google.com")
```

It can also be used with:

```kotlin
Uri.parse("tel:1234567890")
```

---

# 🔐 Permissions

Some Android operations require permissions to be declared in the `AndroidManifest.xml`.

The application demonstrates the use of permissions and runtime permission checking.

Important methods include:

```kotlin
ContextCompat.checkSelfPermission()
```

and

```kotlin
ActivityCompat.requestPermissions()
```

These methods are used to check and request permissions when required.

---

# 📋 ActivityResultContracts

`ActivityResultContracts` provides a modern way to launch Activities and receive results.

It can be used for tasks such as:

- Selecting images
- Taking pictures
- Requesting permissions
- Getting results from another Activity

---

# 🎨 UI Components

The application uses Android UI components such as:

- Button
- ConstraintLayout
- CoordinatorLayout

Buttons are provided for each Intent operation.

---

# 🖼️ Drawable Resource

A drawable resource can be added to the Android project and used as an image or other visual resource in the application.

---

# 📱 Application Features

The application demonstrates:

- Implicit Intent
- Explicit Intent
- Phone Dialer
- Website/URL
- Call Log
- Gallery
- Alarm
- Camera
- Activity Navigation
- Runtime Permissions
- URI handling
- MIME types
- Activity Result APIs
- Buttons
- ConstraintLayout
- CoordinatorLayout

---

# 🛠️ Technologies Used

- **Language:** Kotlin
- **IDE:** Android Studio
- **Platform:** Android
- **UI:** XML
- **Version Control:** Git & GitHub

---

# 📂 Project Structure

```text
24012021038_pr_3
│
├── app
│   └── src
│       └── main
│           ├── java
│           │   └── MainActivity.kt
│           │
│           ├── res
│           │   ├── drawable
│           │   ├── layout
│           │   │   ├── activity_main.xml
│           │   │   └── activity_login.xml
│           │   └── values
│           │
│           └── AndroidManifest.xml
│
└── README.md
```

---

# 🎓 Learning Outcomes

After completing this practical, the student will be able to:

- Understand the concept of Android Intents.
- Differentiate between Explicit and Implicit Intents.
- Use `startActivity()`.
- Open external applications using Implicit Intent.
- Navigate between Activities using Explicit Intent.
- Use `Intent.setData()`.
- Use `Intent.setType()`.
- Work with `Uri.parse()`.
- Understand MIME types such as `image/*`.
- Use Android built-in content types.
- Check and request runtime permissions.
- Use `ActivityResultContracts`.
- Work with Android Buttons and layouts.

---

# 👨‍💻 Author

**Jayshil Patel**

B.Tech – Information Technology  
Ganpat University

---

## 🔗 Repository

**24012021038_pr_3**

This repository contains the Android application developed for **MAD Practical 3 – Implicit & Explicit Intent**.
