package com.swmansion.reanimated.nodes;

import com.facebook.react.bridge.ReadableMap;
import com.swmansion.reanimated.NodesManager;

public class ValueNode extends Node<Double> {

  private Double mValue;

  public ValueNode(int nodeID, ReadableMap config, NodesManager nodesManager) {
    super(nodeID, config, nodesManager);
    mValue = config.getDouble("value");
  }

  public void setValue(double value) {
    mValue = value;
    forceUpdateMemoizedValue(mValue);
  }

  @Override
  protected Double evaluate() {
    return mValue;
  }
}