package crazypants.enderio.conduit.redstone;

import crazypants.enderio.conduit.IConduit;
import crazypants.enderio.conduit.render.DefaultConduitRenderer;

public class InsulatedRedstoneConduitRenderer extends DefaultConduitRenderer {

  @Override
  public boolean isRendererForConduit(IConduit conduit) {
    return conduit instanceof IInsulatedRedstoneConduit;
  }

//  @Override
//  protected void renderConduit(TextureAtlasSprite tex, IConduit conduit, CollidableComponent component, float selfIllum) {
//    if(IInsulatedRedstoneConduit.COLOR_CONTROLLER_ID.equals(component.data)) {
//      if(conduit.containsExternalConnection(component.dir)
//              && !((IInsulatedRedstoneConduit) conduit).isSpecialConnection(component.dir)) {
//        int c = ((IInsulatedRedstoneConduit) conduit).getSignalColor(component.dir).getColor();
////        Tessellator tessellator = Tessellator.instance;
////        tessellator.setColorOpaque_I(c);
////        CubeRenderer.render(component.bound, tex);
////        tessellator.setColorOpaque(255, 255, 255);
//      }
//    } else {
//      super.renderConduit(tex, conduit, component, selfIllum);
//    }
//  }

}
