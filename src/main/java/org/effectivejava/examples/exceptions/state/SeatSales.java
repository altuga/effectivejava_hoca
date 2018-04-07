/**
 * The MIT License
 * Copyright (c) 2014-2016 Ilkka Seppälä
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.effectivejava.examples.exceptions.state;

/**
 * 
 * SeatSales has internal state that defines its behavior.
 * 
 */
public class SeatSales {

  private State state;

  public SeatSales() {
    state = new SeatEmptyState(this);
  }

  /**
   * Makes time pass for the flight sales
   */
  public void timePasses() {
    if (state.getClass().equals(SeatEmptyState.class)) {
      changeStateTo(new SeatIsFullState(this));
    } else {
      changeStateTo(new SeatEmptyState(this));
    }
  }

  public void changeStateTo(State newState) {
    if(newState.getClass().getName().equalsIgnoreCase(this.state.getClass().getName())) {
      //throw new IllegalStateException("Seat state is same");
    }
    this.state = newState;

  }

  @Override
  public String toString() {
    return "The Seat";
  }

  public void observe() {
    this.state.observe();
  }
}
