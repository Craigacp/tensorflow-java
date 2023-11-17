// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/debug_event.proto

package org.tensorflow.proto;

public interface DebuggedGraphOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.DebuggedGraph)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * An ID for the graph.
   * This can be used up to look up graph names. Generated by the debugger.
   * </pre>
   *
   * <code>string graph_id = 1;</code>
   * @return The graphId.
   */
  java.lang.String getGraphId();
  /**
   * <pre>
   * An ID for the graph.
   * This can be used up to look up graph names. Generated by the debugger.
   * </pre>
   *
   * <code>string graph_id = 1;</code>
   * @return The bytes for graphId.
   */
  com.google.protobuf.ByteString
      getGraphIdBytes();

  /**
   * <pre>
   * Name of the graph (if available).
   * </pre>
   *
   * <code>string graph_name = 2;</code>
   * @return The graphName.
   */
  java.lang.String getGraphName();
  /**
   * <pre>
   * Name of the graph (if available).
   * </pre>
   *
   * <code>string graph_name = 2;</code>
   * @return The bytes for graphName.
   */
  com.google.protobuf.ByteString
      getGraphNameBytes();

  /**
   * <pre>
   * Names of the instrumented ops. This can be used to look up op name
   * based on the numeric-summary tensors (2nd column).
   * </pre>
   *
   * <code>repeated string instrumented_ops = 3;</code>
   * @return A list containing the instrumentedOps.
   */
  java.util.List<java.lang.String>
      getInstrumentedOpsList();
  /**
   * <pre>
   * Names of the instrumented ops. This can be used to look up op name
   * based on the numeric-summary tensors (2nd column).
   * </pre>
   *
   * <code>repeated string instrumented_ops = 3;</code>
   * @return The count of instrumentedOps.
   */
  int getInstrumentedOpsCount();
  /**
   * <pre>
   * Names of the instrumented ops. This can be used to look up op name
   * based on the numeric-summary tensors (2nd column).
   * </pre>
   *
   * <code>repeated string instrumented_ops = 3;</code>
   * @param index The index of the element to return.
   * @return The instrumentedOps at the given index.
   */
  java.lang.String getInstrumentedOps(int index);
  /**
   * <pre>
   * Names of the instrumented ops. This can be used to look up op name
   * based on the numeric-summary tensors (2nd column).
   * </pre>
   *
   * <code>repeated string instrumented_ops = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the instrumentedOps at the given index.
   */
  com.google.protobuf.ByteString
      getInstrumentedOpsBytes(int index);

  /**
   * <pre>
   * Original (uninstrumented) GraphDef (if available).
   * </pre>
   *
   * <code>bytes original_graph_def = 4;</code>
   * @return The originalGraphDef.
   */
  com.google.protobuf.ByteString getOriginalGraphDef();

  /**
   * <pre>
   * An encoded version of a GraphDef.
   * This graph may include the debugger-inserted ops.
   * </pre>
   *
   * <code>bytes instrumented_graph_def = 5;</code>
   * @return The instrumentedGraphDef.
   */
  com.google.protobuf.ByteString getInstrumentedGraphDef();

  /**
   * <pre>
   * IDs of the immediate enclosing context (graph), if any.
   * </pre>
   *
   * <code>string outer_context_id = 6;</code>
   * @return The outerContextId.
   */
  java.lang.String getOuterContextId();
  /**
   * <pre>
   * IDs of the immediate enclosing context (graph), if any.
   * </pre>
   *
   * <code>string outer_context_id = 6;</code>
   * @return The bytes for outerContextId.
   */
  com.google.protobuf.ByteString
      getOuterContextIdBytes();
}