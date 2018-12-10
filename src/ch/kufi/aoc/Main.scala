package ch.kufi.aoc

import java.time.LocalDate

object Main {
  val challenges: Map[Int, Challenge[_, _]] = Map(
    1 -> new Day1(),
    2 -> new Day2(),
    3 -> new Day3(),
    4 -> new Day4(),
    5 -> new Day5(),
    6 -> new Day6(),
    7 -> new Day7(),
    8 -> new Day8()
  )

  def main(args: Array[String]): Unit = {
    val challenge = getChallenge(args)
    println(challenge.map(_.part1()).toString)
    println(challenge.map(_.part2()).toString)
  }

  private def getChallenge(args: Array[String]) = {
    if (args.length == 0) {
      challenges.get(LocalDate.now().getDayOfMonth)
    } else {
      challenges.get(args(0).toInt)
    }
  }
}
