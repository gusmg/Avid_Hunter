/*
 * There are essentially 4 different inventories; player's personal inventory, player's
 * equipped items, workshop, and the shop items. Equipment can be in any inventory. There
 * can only ever be 1 of each tool. Bows can be in any inventory, heavy tools (hide stretcher & 
 * oil boiler) can only be in shop and workshop. Other tools are only in shop or personal
 * inventory only.
 */
package byui.cit260.avid_hunter.model;

import java.io.Serializable;
/**
 *
 * @author C§
 */
public class Inventory implements Serializable {
    
    private Item short_bow, short_arrow, long_bow, long_arrow, dragon_bow, magic_arrow, small_game, large_game, dragon_corpse,
            mammal_hide, dragon_hide, soft_leather, hard_leather, dragon_leather, small_vegetable, medium_vegetable, large_vegetable,
            oil, meat, ball_o_cotton, coarse_thread, average_thread, fine_thread, small_veg_seed, medium_veg_seed, large_veg_seed,
            spade, shovel, skinning_knife, /*hide_stretcher, oil_boiler,*/ hand_spinner, spinning_wheel, needle, soft_gloves, hard_gloves,
            dragon_gloves, soft_boots, hard_boots, dragon_boots, soft_pants, hard_pants, dragon_pants, soft_tunic, hard_tunic,
            dragon_tunic, soft_helm, hard_helm, dragon_helm/*, pinning_crimps, soft_gloves$, hard_gloves$, dragon_gloves$, soft_boots$,
            hard_boots$, dragon_boots$, soft_pants$, hard_pants$, dragon_pants$, soft_tunic$, hard_tunic$, dragon_tunic$, soft_helm$,
            hard_helm$, dragon_helm$ */;
    
    public Inventory() {
        
    }
}
