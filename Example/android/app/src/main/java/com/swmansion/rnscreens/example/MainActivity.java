package com.swmansion.rnscreens.example;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.fragment.NavHostFragment;

import com.facebook.react.modules.core.DefaultHardwareBackBtnHandler;
public class MainActivity extends AppCompatActivity implements DefaultHardwareBackBtnHandler {
  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main_activity);
    NavHostFragment navhost = (NavHostFragment)
            getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment);
  }

  @Override
  public void invokeDefaultOnBackPressed() {
    // NOOP
  }

  @Override
  protected void onNewIntent(Intent intent) {
    super.onNewIntent(intent);
    if (intent.getAction().equals(Intent.ACTION_VIEW)) {
      NavHostFragment navhost = (NavHostFragment)
              getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment);
      navhost.getNavController().navigate(R.id.deeplinkFragment);
    }
  }
}
