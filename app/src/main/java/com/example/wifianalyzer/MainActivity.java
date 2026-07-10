package com.example.wifianalyzer;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView txtInfo;
    Button btnRefresh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtInfo = findViewById(R.id.txtInfo);
        btnRefresh = findViewById(R.id.btnRefresh);

        btnRefresh.setOnClickListener(v -> loadWifiInfo());

        loadWifiInfo();
    }

    private void loadWifiInfo() {
        WifiManager wifiManager =
                (WifiManager) getApplicationContext()
                        .getSystemService(Context.WIFI_SERVICE);

        if (wifiManager == null || !wifiManager.isWifiEnabled()) {
            txtInfo.setText("Wi-Fi is turned off.");
            return;
        }

        WifiInfo info = wifiManager.getConnectionInfo();

        int ip = info.getIpAddress();
        String ipAddress = String.format(
                "%d.%d.%d.%d",
                (ip & 0xff),
                (ip >> 8 & 0xff),
                (ip >> 16 & 0xff),
                (ip >> 24 & 0xff)
        );

        String data =
                "SSID: " + info.getSSID() +
                "\n\nBSSID: " + info.getBSSID() +
                "\n\nSignal: " + info.getRssi() + " dBm" +
                "\n\nLink Speed: " + info.getLinkSpeed() + " Mbps" +
                "\n\nFrequency: " + info.getFrequency() + " MHz" +
                "\n\nIP Address: " + ipAddress;

        txtInfo.setText(data);
    }
}