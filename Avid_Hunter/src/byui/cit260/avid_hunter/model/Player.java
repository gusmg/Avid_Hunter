/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.avid_hunter.model;
import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author C§
 */
public class Player implements Serializable{
    
    private String name;
    private Inventory BackPack, Equipment, Storage;
    private int gold = 100;
    private int encumbrance = 0, huntingXP = 0, skinningXP = 0, leatherMakingXP = 0, gardeningXP = 0,
            oilBoilingXP = 0, cottonPickingXP = 0, threadSpinningXP = 0, armorCraftingXP = 0;

    public Player() { //default constructor
        BackPack = new Inventory();
        Equipment = new Inventory();
        Storage = new Inventory();
    }
    
    public Player(String pname, Inventory bkpk, Inventory eqpt, Inventory stg, int cash, int encum, int hunt, int skin,
            int leather, int garden, int boil, int pick, int spin, int acraft) { //load/continue game constructor
        name = pname;
        BackPack = bkpk;
        Equipment = eqpt;
        Storage = stg;        
        gold = cash;
        encumbrance = encum;
        huntingXP = hunt;
        skinningXP = skin;
        leatherMakingXP = leather;
        gardeningXP = garden;
        oilBoilingXP = boil;
        cottonPickingXP = pick;
        threadSpinningXP = spin;
        armorCraftingXP = acraft;
    }

    public String getName() {
        return name;
    }

    public void setName(String pname) {
        this.name = pname;
    }

    public Inventory getBackpack() {
        return BackPack;
    }

    public void setBackpack(Inventory bkpk) {
        this.BackPack = bkpk;
    }

    public Inventory getEquipment() {
        return Equipment;
    }

    public void setEquipment(Inventory eqpt) {
        this.Equipment = eqpt;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getEncumbrance() {
        return encumbrance;
    }

    public void setEncumbrance(int encum) {
        this.encumbrance = encum;
    }

    public int getHuntingXP() {
        return huntingXP;
    }

    public void setHuntingXP(int hxp) {
        this.huntingXP = hxp;
    }

    public int getSkinningXP() {
        return skinningXP;
    }

    public void setSkinningXP(int sxp) {
        this.skinningXP = sxp;
    }

    public int getLeatherMakingXP() {
        return leatherMakingXP;
    }

    public void setLeatherMakingXP(int lmxp) {
        this.leatherMakingXP = lmxp;
    }

    public int getGardeningXP() {
        return gardeningXP;
    }

    public void setGardeningXP(int gxp) {
        this.gardeningXP = gxp;
    }

    public int getOilBoilingXP() {
        return oilBoilingXP;
    }

    public void setOilBoilingXP(int obxp) {
        this.oilBoilingXP = obxp;
    }

    public int getCottonPickingXP() {
        return cottonPickingXP;
    }

    public void setCottonPickingXP(int cpxp) {
        this.cottonPickingXP = cpxp;
    }

    public int getThreadSpinningXP() {
        return threadSpinningXP;
    }

    public void setThreadSpinningXP(int tsxp) {
        this.threadSpinningXP = tsxp;
    }

    public int getArmorCraftingXP() {
        return armorCraftingXP;
    }

    public void setArmorCraftingXP(int acxp) {
        this.armorCraftingXP = acxp;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.name);
        hash = 53 * hash + Objects.hashCode(this.BackPack);
        hash = 53 * hash + Objects.hashCode(this.Equipment);
        hash = 53 * hash + Objects.hashCode(this.Storage);
        hash = 53 * hash + this.gold;
        hash = 53 * hash + this.encumbrance;
        hash = 53 * hash + this.huntingXP;
        hash = 53 * hash + this.skinningXP;
        hash = 53 * hash + this.leatherMakingXP;
        hash = 53 * hash + this.gardeningXP;
        hash = 53 * hash + this.oilBoilingXP;
        hash = 53 * hash + this.cottonPickingXP;
        hash = 53 * hash + this.threadSpinningXP;
        hash = 53 * hash + this.armorCraftingXP;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Player other = (Player) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.BackPack, other.BackPack)) {
            return false;
        }
        if (!Objects.equals(this.Equipment, other.Equipment)) {
            return false;
        }
        if (!Objects.equals(this.Storage, other.Storage)) {
            return false;
        }
        if (this.gold != other.gold) {
            return false;
        }
        if (this.encumbrance != other.encumbrance) {
            return false;
        }
        if (this.huntingXP != other.huntingXP) {
            return false;
        }
        if (this.skinningXP != other.skinningXP) {
            return false;
        }
        if (this.leatherMakingXP != other.leatherMakingXP) {
            return false;
        }
        if (this.gardeningXP != other.gardeningXP) {
            return false;
        }
        if (this.oilBoilingXP != other.oilBoilingXP) {
            return false;
        }
        if (this.cottonPickingXP != other.cottonPickingXP) {
            return false;
        }
        if (this.threadSpinningXP != other.threadSpinningXP) {
            return false;
        }
        if (this.armorCraftingXP != other.armorCraftingXP) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", BackPack=" + BackPack + ", Equipment=" + Equipment + ", Storage=" + Storage + ", gold=" + gold + ", encumbrance=" + encumbrance + ", huntingXP=" + huntingXP + ", skinningXP=" + skinningXP + ", leatherMakingXP=" + leatherMakingXP + ", gardeningXP=" + gardeningXP + ", oilBoilingXP=" + oilBoilingXP + ", cottonPickingXP=" + cottonPickingXP + ", threadSpinningXP=" + threadSpinningXP + ", armorCraftingXP=" + armorCraftingXP + '}';
    }
    
}
