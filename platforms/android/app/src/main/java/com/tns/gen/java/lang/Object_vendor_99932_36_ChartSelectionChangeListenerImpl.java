/* AUTO-GENERATED FILE. DO NOT MODIFY.
 * This class was automatically generated by the
 * static binding generator from the resources it found.
 * Please do not modify by hand.
 */
package com.tns.gen.java.lang;

public class Object_vendor_99932_36_ChartSelectionChangeListenerImpl extends java.lang.Object
    implements com.tns.NativeScriptHashCodeProvider,
        com.telerik.widget.chart.visualization.behaviors.ChartSelectionChangeListener {
  public Object_vendor_99932_36_ChartSelectionChangeListenerImpl() {
    super();
    com.tns.Runtime.initInstance(this);
  }

  public void onSelectionChanged(
      com.telerik.widget.chart.visualization.behaviors.ChartSelectionContext param_0) {
    java.lang.Object[] args = new java.lang.Object[1];
    args[0] = param_0;
    com.tns.Runtime.callJSMethod(this, "onSelectionChanged", void.class, args);
  }

  public int hashCode__super() {
    return super.hashCode();
  }

  public boolean equals__super(java.lang.Object other) {
    return super.equals(other);
  }
}
