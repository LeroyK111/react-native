/*
 * Copyright (c) Meta Platforms, Inc. and affiliates.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

package com.facebook.react.fabric

/**
 * Utility class for Fabric components, this will be removed
 *
 * TODO T97384889: remove this class when the component names are unified between JS - Android -
 * iOS - C++
 */
public object FabricComponents {

  // TODO T97384889: unify component names between JS - Android - iOS - C++
  private val componentNames: Map<String, String> =
      mapOf(
          "View" to "RCTView",
          "Image" to "RCTImageView",
          "ScrollView" to "RCTScrollView",
          "Slider" to "RCTSlider",
          "ModalHostView" to "RCTModalHostView",
          "Paragraph" to "RCTText",
          "Text" to "RCText",
          "RawText" to "RCTRawText",
          "ActivityIndicatorView" to "AndroidProgressBar",
          "ShimmeringView" to "RKShimmeringView",
          "TemplateView" to "RCTTemplateView",
          "AxialGradientView" to "RCTAxialGradientView",
          "Video" to "RCTVideo",
          "Map" to "RCTMap",
          "WebView" to "RCTWebView",
          "Keyframes" to "RCTKeyframes",
          "ImpressionTrackingView" to "RCTImpressionTrackingView",
          "SafeAreaView" to "RCTSafeAreaView",
      )

  /** @return the name of component in the Fabric environment */
  @JvmStatic
  public fun getFabricComponentName(componentName: String): String =
      componentNames.get(componentName) ?: componentName
}
