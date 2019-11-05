/*
 * Copyright © 2019, Oracle and/or its affiliates. All rights reserved.
 */
package org.tensorflow.sandbox.optimizers;

import org.tensorflow.Graph;
import org.tensorflow.Operand;
import org.tensorflow.Output;
import org.tensorflow.op.core.Constant;
import org.tensorflow.op.core.Variable;
import org.tensorflow.types.TFloat;
import org.tensorflow.types.family.TType;

import java.util.List;

/**
 * Optimizer that implements the Adagrad algorithm.
 *
 * See the <a href="http://www.jmlr.org/papers/volume12/duchi11a/duchi11a.pdf">paper</a>
 * or this <a href="https://ppasupat.github.io/a9online/uploads/proximal_notes.pdf">intro</a>.
 */
public class AdaGrad extends Optimizer {

  public static final String ACCUMULATOR = "accumulator";

  private final float learningRate;

  private final float initialAccumulatorValue;

  public AdaGrad(Graph graph, float learningRate) {
    this(graph, learningRate, 0.01f);
  }

  public AdaGrad(Graph graph, float learningRate, float initialAccumulatorValue) {
    super(graph);
    this.learningRate = learningRate;
    this.initialAccumulatorValue = initialAccumulatorValue;
  }

  @Override
  protected void createSlots(List<Output<? extends TType>> variables) {
    for (Output<? extends TType> v : variables) {
      createAdaGradSlot(v);
    }
  }

  private <T extends TType> void createAdaGradSlot(Output<T> v) {
    Operand<T> initializer = tf.fill(tf.shape(v), (Constant<T>) tf.constant(initialAccumulatorValue, TFloat.DTYPE));//v.dataType()));
    createSlot(v.asOutput(), ACCUMULATOR, initializer);
  }

  @Override
  protected <T extends TType> Operand<T> applyDense(Output<T> gradient, Output<T> variable) {
    @SuppressWarnings("unchecked") // suppressed as the slots are created to have the dtype of the variable.
    Variable<T> slot = (Variable<T>) getSlot(variable,ACCUMULATOR).get();
    return tf.train.applyAdagrad(variable, slot, tf.constant(learningRate, gradient.dataType()), gradient);
  }

  @Override
  public String toString() {
    return "AdaGrad{" +
        "learningRate=" + learningRate +
        ", initialAccumulatorValue=" + initialAccumulatorValue +
        '}';
  }

  @Override
  public String getOptimizerName() {
    return "Adagrad";
  }
}
