class A >>region>>{
  def foo =>>region>>
    for {
      x <- ???
    } {
      ???
    }<<region<<

  def noSpacing =>>region>>
    for{
      x <- ???
    }>>region>>{
      ???
      ???
      ???
      ???
    }<<region<<<<region<<

  def why =>>region>>
    for

      >>region>>{
        x <- ???
        y <- ???
        z <- ???
    }

  // yes, it is the body
  <<region<<{
    ???
  }<<region<<
}<<region<<
