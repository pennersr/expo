package expo.modules.devmenu.react

import android.content.Context
import com.facebook.react.packagerconnection.PackagerConnectionSettings

/**
 * Class representing react's internal [PackagerConnectionSettings] class, which we want to replace to change bundler's url.
 * It is only use when [expo.modules.devmenu.DevMenuReactNativeHost.getUseDeveloperSupport] returns true.
 */
class DevMenuPackagerConnectionSettings(
  private val serverIp: String,
  applicationContext: Context
) : PackagerConnectionSettings(applicationContext) {
  override var debugServerHost: String
    get() = serverIp
    set(host: String) {}
}
