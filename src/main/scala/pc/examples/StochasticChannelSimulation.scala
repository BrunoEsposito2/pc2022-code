package pc.examples

import java.util.Random
import pc.examples.StochasticChannel.*
import pc.utils.Time

/***
 * LAB 3 - 16/11/22
 *
 * API for "The simulator" task
 *
 * @param simulation is the StochasticChannel
 * @param runs
 * @tparam A
 */
class StochasticChannelSimulation[A](simulation: A, runs: Int):
  val t0: Long = ??? //java.lang.System.nanoTime
  def avgRunTime: Double = ???
  def failPercentage: Double = ???
  private def runSimulation(v: =>A): Unit = ???

object StochasticChannelSimulation


@main def mainStochasticChannelSimulation =
  Time.timed(
    println(stocChannel.newSimulationTrace(IDLE, new Random)
                           .take(10)
                           .toList
                           .mkString("\n")))

  StochasticChannelSimulation(stocChannel, 10)