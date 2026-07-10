# WiFi Analyzer

A simple Android app that displays detailed WiFi network information.

## Features

- Display current WiFi SSID
- Show BSSID (MAC address)
- Display signal strength (RSSI)
- Show link speed
- Display frequency
- Show IP address
- Refresh button to update information

## Permissions Required

- `ACCESS_WIFI_STATE` - To access WiFi state information
- `ACCESS_NETWORK_STATE` - To access network state
- `ACCESS_FINE_LOCATION` - Required for WiFi scanning on Android 6.0+

## Requirements

- Android 7.0 (API 24) or higher
- WiFi enabled on the device

## How to Build

1. Clone the repository
2. Open in Android Studio
3. Build and run on your Android device or emulator

## Usage

1. Launch the app
2. The WiFi information will be displayed automatically
3. Tap the "Refresh" button to update the information

## Project Structure

```
Homito/
├── app/
│   ├── src/
│   │   └── main/
│   │       ├── java/
│   │       │   └── com/example/wifianalyzer/
│   │       │       └── MainActivity.java
│   │       ├── res/
│   │       │   └── layout/
│   │       │       └── activity_main.xml
│   │       └── AndroidManifest.xml
│   └── build.gradle
├── build.gradle
├── settings.gradle
└── README.md
```

## License

MIT License