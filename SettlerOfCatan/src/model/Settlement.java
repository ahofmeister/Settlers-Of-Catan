package model;

import java.util.List;

public class Settlement extends PlayingPiece {

  @Override
  public List<Cost> buildCosts() {
    return Cost.of(ResourceType.LUMBER, 1, ResourceType.BRICK, 1, ResourceType.GRAIN, 1, ResourceType.WOOL, 1);
  }

}
