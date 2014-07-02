/*
 * Modelo creado por Krill13
 * y obtenido de http://techne.zeux.me/594b2e81
 * bajo licencia "WTFPL" http://www.wtfpl.net
 * todos los creditos del modelo y textura a Krill13
 */


package openblocks.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelDragonKnight extends ModelBase
{
	 //fields
    ModelRenderer Shape1;
    ModelRenderer Shape1b;
    ModelRenderer Shape1c;
    ModelRenderer Shape2;
    ModelRenderer Shape2b;
    ModelRenderer Shape2c;
    ModelRenderer Shape2d;
    ModelRenderer Shape4;
    ModelRenderer Shape5;
    ModelRenderer Shape7;
    ModelRenderer Shape7b;
    ModelRenderer Shape5b;
    ModelRenderer Shape5c;
    ModelRenderer Shape8;
    ModelRenderer Shape9;
    ModelRenderer Shape10;
    ModelRenderer Shape11;
    ModelRenderer Shape10b;
    ModelRenderer Shape17;
    ModelRenderer Shape24;
    ModelRenderer Shape25;
    ModelRenderer Shape26;
    ModelRenderer Shape27;
    ModelRenderer Shape28;
    ModelRenderer Shape33;
    ModelRenderer Shape6;
    ModelRenderer Shape29;
    ModelRenderer Shape31;
    ModelRenderer Shape32;
    ModelRenderer Shape34;
    ModelRenderer Shape35;
    ModelRenderer Shape36;
    ModelRenderer Shape37;
    ModelRenderer Shape38;
    ModelRenderer Shape39;
    ModelRenderer Shape40;
    ModelRenderer Shape41;
    ModelRenderer Shape43;
    ModelRenderer Shape42;
    ModelRenderer Shape6b;
    ModelRenderer Shape44;
    ModelRenderer Shape46;
    ModelRenderer Shape47;
    ModelRenderer Shape48;
    ModelRenderer Shape49;
    ModelRenderer Shape50;
    ModelRenderer Shape51;
    ModelRenderer Shape52;
    ModelRenderer Shape53;
    ModelRenderer Shape41b;
    ModelRenderer Shape54;
    ModelRenderer Shape43b;
    ModelRenderer Shape42b;
    ModelRenderer Shape55;
    ModelRenderer Shape56;
    ModelRenderer Shape57;
    ModelRenderer Shape58;
    ModelRenderer Shape59;
    ModelRenderer Shape3;
    ModelRenderer Shape12;
    ModelRenderer Shape13;
    ModelRenderer Shape14;
    ModelRenderer Shape15;
    ModelRenderer Shape16;
    ModelRenderer Shape18;
    ModelRenderer Shape19;
    ModelRenderer Shape20;
    ModelRenderer Shape21;
    ModelRenderer Shape22;
    ModelRenderer Shape23;
    ModelRenderer Shape30;
    ModelRenderer Shape45;
    ModelRenderer Shape60;
    ModelRenderer Shape61;
    ModelRenderer Shape62;
    ModelRenderer Shape63;
    ModelRenderer Shape64;
    ModelRenderer Shape65;
    ModelRenderer Shape66;
    ModelRenderer Shape67;
    ModelRenderer Shape68;
    ModelRenderer Shape69;
    ModelRenderer Shape70;
    ModelRenderer Shape71;
    ModelRenderer Shape72;
    ModelRenderer Shape73;
  
  public ModelDragonKnight()
  {
    textureWidth = 256;
    textureHeight = 128;
    
      Shape1 = new ModelRenderer(this, 0, 80);
      Shape1.addBox(0F, 0F, 0F, 3, 10, 3);
      Shape1.setRotationPoint(-3F, 0F, 0F);
      Shape1.setTextureSize(256, 128);
      Shape1.mirror = true;
      setRotation(Shape1, -0.5235988F, 0F, 0F);
      Shape1b = new ModelRenderer(this, 30, 85);
      Shape1b.addBox(0F, 0F, 0F, 3, 17, 3);
      Shape1b.setRotationPoint(3F, 1F, 0F);
      Shape1b.setTextureSize(256, 128);
      Shape1b.mirror = true;
      setRotation(Shape1b, 0F, 0F, 0F);
      Shape1c = new ModelRenderer(this, 0, 95);
      Shape1c.addBox(0F, 0F, 0F, 3, 10, 3);
      Shape1c.setRotationPoint(-3F, 9F, -5F);
      Shape1c.setTextureSize(256, 128);
      Shape1c.mirror = true;
      setRotation(Shape1c, 1.047198F, 0F, 0F);
      Shape2 = new ModelRenderer(this, 0, 110);
      Shape2.addBox(0F, 0F, 0F, 5, 1, 5);
      Shape2.setRotationPoint(-4F, 15F, 3F);
      Shape2.setTextureSize(256, 128);
      Shape2.mirror = true;
      setRotation(Shape2, 1.047198F, 0F, 0F);
      Shape2b = new ModelRenderer(this, 0, 120);
      Shape2b.addBox(0F, 0F, 0F, 1, 1, 3);
      Shape2b.setRotationPoint(-4F, 17.5F, 1.5F);
      Shape2b.setTextureSize(256, 128);
      Shape2b.mirror = true;
      setRotation(Shape2b, 1.047198F, 0F, 0F);
      Shape2c = new ModelRenderer(this, 10, 120);
      Shape2c.addBox(0F, 0F, 0F, 1, 1, 3);
      Shape2c.setRotationPoint(-2F, 17.5F, 1.5F);
      Shape2c.setTextureSize(256, 128);
      Shape2c.mirror = true;
      setRotation(Shape2c, 1.047198F, 0F, 0F);
      Shape2d = new ModelRenderer(this, 20, 120);
      Shape2d.addBox(0F, 0F, 0F, 1, 1, 3);
      Shape2d.setRotationPoint(0F, 17.5F, 1.5F);
      Shape2d.setTextureSize(256, 128);
      Shape2d.mirror = true;
      setRotation(Shape2d, 1.047198F, 0F, 0F);
      Shape4 = new ModelRenderer(this, 28, 106);
      Shape4.addBox(0F, 0F, 0F, 5, 1, 5);
      Shape4.setRotationPoint(2F, 20F, 1F);
      Shape4.setTextureSize(256, 128);
      Shape4.mirror = true;
      setRotation(Shape4, 1.047198F, 0F, 0F);
      Shape5 = new ModelRenderer(this, 30, 113);
      Shape5.addBox(0F, 0F, 0F, 1, 1, 3);
      Shape5.setRotationPoint(2F, 22.5F, -0.5F);
      Shape5.setTextureSize(256, 128);
      Shape5.mirror = true;
      setRotation(Shape5, 1.047198F, 0F, 0F);
      Shape7 = new ModelRenderer(this, 0, 55);
      Shape7.addBox(0F, 0F, 0F, 7, 8, 4);
      Shape7.setRotationPoint(-2F, -10F, -1F);
      Shape7.setTextureSize(256, 128);
      Shape7.mirror = true;
      setRotation(Shape7, 0F, 0F, 0F);
      Shape7b = new ModelRenderer(this, 0, 40);
      Shape7b.addBox(0F, 0F, 0F, 6, 9, 4);
      Shape7b.setRotationPoint(-1.5F, -19F, -1F);
      Shape7b.setTextureSize(256, 128);
      Shape7b.mirror = true;
      setRotation(Shape7b, 0F, 0F, 0F);
      Shape5b = new ModelRenderer(this, 50, 113);
      Shape5b.addBox(0F, 0F, 0F, 1, 1, 3);
      Shape5b.setRotationPoint(6F, 22.5F, -0.5F);
      Shape5b.setTextureSize(256, 128);
      Shape5b.mirror = true;
      setRotation(Shape5b, 1.047198F, 0F, 0F);
      Shape5c = new ModelRenderer(this, 40, 113);
      Shape5c.addBox(0F, 0F, 0F, 1, 1, 3);
      Shape5c.setRotationPoint(4F, 22.5F, -0.5F);
      Shape5c.setTextureSize(256, 128);
      Shape5c.mirror = true;
      setRotation(Shape5c, 1.047198F, 0F, 0F);
      Shape8 = new ModelRenderer(this, 40, 40);
      Shape8.addBox(0F, 0F, 0F, 4, 1, 4);
      Shape8.setRotationPoint(-5.5F, -18F, -1F);
      Shape8.setTextureSize(256, 128);
      Shape8.mirror = true;
      setRotation(Shape8, 0F, 0F, 0F);
      Shape9 = new ModelRenderer(this, 65, 40);
      Shape9.addBox(0F, 0F, 0F, 4, 1, 4);
      Shape9.setRotationPoint(4.5F, -18F, -1F);
      Shape9.setTextureSize(256, 128);
      Shape9.mirror = true;
      setRotation(Shape9, 0F, 0F, 0F);
      Shape10 = new ModelRenderer(this, 44, 47);
      Shape10.addBox(0F, 0F, 0F, 2, 15, 2);
      Shape10.setRotationPoint(-2F, -18F, 0F);
      Shape10.setTextureSize(256, 128);
      Shape10.mirror = true;
      setRotation(Shape10, 0F, 0F, 0.5235988F);
      Shape11 = new ModelRenderer(this, 40, 66);
      Shape11.addBox(0F, 14F, 0F, 3, 2, 3);
      Shape11.setRotationPoint(-2.5F, -18F, -0.5F);
      Shape11.setTextureSize(256, 128);
      Shape11.mirror = true;
      setRotation(Shape11, 0F, 0F, 0.5235988F);
      Shape10b = new ModelRenderer(this, 65, 47);
      Shape10b.addBox(0F, 0F, 0F, 2, 15, 2);
      Shape10b.setRotationPoint(4.5F, -17F, 0F);
      Shape10b.setTextureSize(256, 128);
      Shape10b.mirror = true;
      setRotation(Shape10b, 0F, 0F, -0.5235988F);
      Shape17 = new ModelRenderer(this, 65, 66);
      Shape17.addBox(-0.8F, 15.4F, -0.5F, 3, 2, 3);
      Shape17.setRotationPoint(4.5F, -17.5F, 0F);
      Shape17.setTextureSize(256, 128);
      Shape17.mirror = true;
      setRotation(Shape17, 0F, 0F, -0.5235988F);
      Shape24 = new ModelRenderer(this, 0, 25);
      Shape24.addBox(0F, 0F, 0F, 5, 5, 5);
      Shape24.setRotationPoint(-1F, -24F, -2F);
      Shape24.setTextureSize(256, 128);
      Shape24.mirror = true;
      setRotation(Shape24, 0F, 0F, 0F);
      Shape25 = new ModelRenderer(this, 25, 30);
      Shape25.addBox(0F, 0F, 0F, 3, 2, 3);
      Shape25.setRotationPoint(0F, -21F, -5F);
      Shape25.setTextureSize(256, 128);
      Shape25.mirror = true;
      setRotation(Shape25, 0F, 0F, 0F);
      Shape26 = new ModelRenderer(this, 39, 33);
      Shape26.addBox(0F, 0F, 0F, 1, 1, 1);
      Shape26.setRotationPoint(1F, -21F, -5F);
      Shape26.setTextureSize(256, 128);
      Shape26.mirror = true;
      setRotation(Shape26, 0.7853982F, 0F, 0F);
      Shape27 = new ModelRenderer(this, 0, 18);
      Shape27.addBox(0F, 0F, 0F, 1, 1, 4);
      Shape27.setRotationPoint(-1F, -24F, 2F);
      Shape27.setTextureSize(256, 128);
      Shape27.mirror = true;
      setRotation(Shape27, 0.7853982F, 0F, 0F);
      Shape28 = new ModelRenderer(this, 11, 18);
      Shape28.addBox(0F, 0F, 0F, 1, 1, 4);
      Shape28.setRotationPoint(3F, -24F, 2F);
      Shape28.setTextureSize(256, 128);
      Shape28.mirror = true;
      setRotation(Shape28, 0.7853982F, 0F, 0F);
      Shape33 = new ModelRenderer(this, 0, 70);
      Shape33.addBox(0F, 0F, 0F, 9, 3, 4);
      Shape33.setRotationPoint(-3F, -2F, -1F);
      Shape33.setTextureSize(256, 128);
      Shape33.mirror = true;
      setRotation(Shape33, 0F, 0F, 0F);
      Shape6 = new ModelRenderer(this, 172, 0);
      Shape6.addBox(0F, 0F, 0F, 13, 2, 2);
      Shape6.setRotationPoint(3F, -17F, 3F);
      Shape6.setTextureSize(256, 128);
      Shape6.mirror = true;
      setRotation(Shape6, 0F, 0F, -0.2617994F);
      Shape29 = new ModelRenderer(this, 204, 0);
      Shape29.addBox(11F, -15.5F, 0F, 2, 13, 2);
      Shape29.setRotationPoint(3F, -17F, 3F);
      Shape29.setTextureSize(256, 128);
      Shape29.mirror = true;
      setRotation(Shape29, 0F, 0F, 0.0872665F);
      Shape31 = new ModelRenderer(this, 172, 24);
      Shape31.addBox(15F, -10.5F, 0F, 13, 1, 2);
      Shape31.setRotationPoint(3F, -17F, 3F);
      Shape31.setTextureSize(256, 128);
      Shape31.mirror = true;
      setRotation(Shape31, 0F, 0F, -0.1745329F);
      Shape32 = new ModelRenderer(this, 203, 24);
      Shape32.addBox(25.8F, -15.3F, 0F, 13, 1, 2);
      Shape32.setRotationPoint(3F, -17F, 3F);
      Shape32.setTextureSize(256, 128);
      Shape32.mirror = true;
      setRotation(Shape32, 0F, 0F, 0F);
      Shape34 = new ModelRenderer(this, 235, 24);
      Shape34.addBox(16.7F, -38.3F, 0.5F, 1, 1, 1);
      Shape34.setRotationPoint(3F, -17F, 3F);
      Shape34.setTextureSize(256, 128);
      Shape34.mirror = true;
      setRotation(Shape34, 0F, 0F, 0.7853982F);
      Shape35 = new ModelRenderer(this, 172, 30);
      Shape35.addBox(5F, -17F, 0F, 13, 1, 2);
      Shape35.setRotationPoint(3F, -17F, 3F);
      Shape35.setTextureSize(256, 128);
      Shape35.mirror = true;
      setRotation(Shape35, 0F, 0F, 0.5235988F);
      Shape36 = new ModelRenderer(this, 203, 30);
      Shape36.addBox(7F, -23.7F, 0F, 13, 1, 2);
      Shape36.setRotationPoint(3F, -17F, 3F);
      Shape36.setTextureSize(256, 128);
      Shape36.mirror = true;
      setRotation(Shape36, 0F, 0F, 1.047198F);
      Shape37 = new ModelRenderer(this, 235, 30);
      Shape37.addBox(30F, -3F, 0.5F, 1, 1, 1);
      Shape37.setRotationPoint(3F, -17F, 3F);
      Shape37.setTextureSize(256, 128);
      Shape37.mirror = true;
      setRotation(Shape37, 0F, 0F, 0.2617994F);
      Shape38 = new ModelRenderer(this, 172, 36);
      Shape38.addBox(-5F, -15.6F, 0F, 13, 1, 2);
      Shape38.setRotationPoint(3F, -17F, 3F);
      Shape38.setTextureSize(256, 128);
      Shape38.mirror = true;
      setRotation(Shape38, 0F, 0F, 1.22173F);
      Shape39 = new ModelRenderer(this, 203, 36);
      Shape39.addBox(-2.5F, -17.4F, 0F, 13, 1, 2);
      Shape39.setRotationPoint(3F, -17F, 3F);
      Shape39.setTextureSize(256, 128);
      Shape39.mirror = true;
      setRotation(Shape39, 0F, 0F, 1.832596F);
      Shape40 = new ModelRenderer(this, 235, 36);
      Shape40.addBox(-5F, -19.8F, 0.5F, 1, 1, 1);
      Shape40.setRotationPoint(3F, -17F, 3F);
      Shape40.setTextureSize(256, 128);
      Shape40.mirror = true;
      setRotation(Shape40, 0F, 0F, 2.617994F);
      Shape41 = new ModelRenderer(this, 172, 41);
      Shape41.addBox(14F, -11.5F, 0F, 22, 13, 1);
      Shape41.setRotationPoint(3F, -17F, 3.5F);
      Shape41.setTextureSize(256, 128);
      Shape41.mirror = true;
      setRotation(Shape41, 0F, 0F, -0.1047198F);
      Shape43 = new ModelRenderer(this, 172, 58);
      Shape43.addBox(12.8F, 1.2F, 0F, 20, 15, 1);
      Shape43.setRotationPoint(3F, -17F, 3.5F);
      Shape43.setTextureSize(256, 128);
      Shape43.mirror = true;
      setRotation(Shape43, 0F, 0F, -0.5235988F);
      Shape42 = new ModelRenderer(this, 172, 76);
      Shape42.addBox(0F, 0.8F, 0F, 17, 11, 1);
      Shape42.setRotationPoint(3F, -17F, 3.5F);
      Shape42.setTextureSize(256, 128);
      Shape42.mirror = true;
      setRotation(Shape42, 0F, 0F, -0.2617994F);
      Shape6b = new ModelRenderer(this, 102, 0);
      Shape6b.addBox(-12.5F, 0F, 0F, 13, 2, 2);
      Shape6b.setRotationPoint(-1F, -17F, 3F);
      Shape6b.setTextureSize(256, 128);
      Shape6b.mirror = true;
      setRotation(Shape6b, 0F, 0F, 0.2617994F);
      Shape44 = new ModelRenderer(this, 135, 0);
      Shape44.addBox(-12.5F, -15.5F, 0F, 2, 13, 2);
      Shape44.setRotationPoint(-1F, -17F, 3F);
      Shape44.setTextureSize(256, 128);
      Shape44.mirror = true;
      setRotation(Shape44, 0F, 0F, -0.0872665F);
      Shape46 = new ModelRenderer(this, 102, 24);
      Shape46.addBox(-27.5F, -10.4F, 0F, 13, 1, 2);
      Shape46.setRotationPoint(-1F, -17F, 3F);
      Shape46.setTextureSize(256, 128);
      Shape46.mirror = true;
      setRotation(Shape46, 0F, 0F, 0.1745329F);
      Shape47 = new ModelRenderer(this, 133, 24);
      Shape47.addBox(-38F, -15F, 0F, 13, 1, 2);
      Shape47.setRotationPoint(-1F, -17F, 3F);
      Shape47.setTextureSize(256, 128);
      Shape47.mirror = true;
      setRotation(Shape47, 0F, 0F, 0F);
      Shape48 = new ModelRenderer(this, 165, 24);
      Shape48.addBox(-17.3F, -37.5F, 0.5F, 1, 1, 1);
      Shape48.setRotationPoint(-1F, -17F, 3F);
      Shape48.setTextureSize(256, 128);
      Shape48.mirror = true;
      setRotation(Shape48, 0F, 0F, -0.7853982F);
      Shape49 = new ModelRenderer(this, 102, 30);
      Shape49.addBox(-19F, -16.5F, 0F, 13, 1, 2);
      Shape49.setRotationPoint(-1F, -17F, 3F);
      Shape49.setTextureSize(256, 128);
      Shape49.mirror = true;
      setRotation(Shape49, 0F, 0F, -0.5235988F);
      Shape50 = new ModelRenderer(this, 133, 30);
      Shape50.addBox(-21F, -23.8F, 0F, 13, 1, 2);
      Shape50.setRotationPoint(-1F, -17F, 3F);
      Shape50.setTextureSize(256, 128);
      Shape50.mirror = true;
      setRotation(Shape50, 0F, 0F, -1.047198F);
      Shape51 = new ModelRenderer(this, 165, 30);
      Shape51.addBox(-32F, -2F, 0.5F, 1, 1, 1);
      Shape51.setRotationPoint(-1F, -17F, 3F);
      Shape51.setTextureSize(256, 128);
      Shape51.mirror = true;
      setRotation(Shape51, 0F, 0F, -0.2617994F);
      Shape52 = new ModelRenderer(this, 102, 36);
      Shape52.addBox(-9F, -15F, 0F, 13, 1, 2);
      Shape52.setRotationPoint(-1F, -17F, 3F);
      Shape52.setTextureSize(256, 128);
      Shape52.mirror = true;
      setRotation(Shape52, 0F, 0F, -1.22173F);
      Shape53 = new ModelRenderer(this, 133, 36);
      Shape53.addBox(-12F, -17.5F, 0F, 13, 1, 2);
      Shape53.setRotationPoint(-1F, -17F, 3F);
      Shape53.setTextureSize(256, 128);
      Shape53.mirror = true;
      setRotation(Shape53, 0F, 0F, -1.832596F);
      Shape41b = new ModelRenderer(this, 111, 41);
      Shape41b.addBox(-36F, -11.3F, 0F, 22, 13, 1);
      Shape41b.setRotationPoint(-1F, -17F, 3.5F);
      Shape41b.setTextureSize(256, 128);
      Shape41b.mirror = true;
      setRotation(Shape41b, 0F, 0F, 0.1047198F);
      Shape54 = new ModelRenderer(this, 165, 36);
      Shape54.addBox(3F, -21F, 0.5F, 1, 1, 1);
      Shape54.setRotationPoint(-1F, -17F, 3F);
      Shape54.setTextureSize(256, 128);
      Shape54.mirror = true;
      setRotation(Shape54, 0F, 0F, -2.617994F);
      Shape43b = new ModelRenderer(this, 111, 58);
      Shape43b.addBox(-32F, 1.1F, 0F, 20, 15, 1);
      Shape43b.setRotationPoint(-1F, -17F, 3.5F);
      Shape43b.setTextureSize(256, 128);
      Shape43b.mirror = true;
      setRotation(Shape43b, 0F, 0F, 0.5235988F);
      Shape42b = new ModelRenderer(this, 111, 76);
      Shape42b.addBox(-16F, 1F, 0F, 17, 11, 1);
      Shape42b.setRotationPoint(-1F, -17F, 3.5F);
      Shape42b.setTextureSize(256, 128);
      Shape42b.mirror = true;
      setRotation(Shape42b, 0F, 0F, 0.2617994F);
      Shape55 = new ModelRenderer(this, 33, 122);
      Shape55.addBox(0F, 0F, 0F, 1, 1, 4);
      Shape55.setRotationPoint(1F, -1F, 3F);
      Shape55.setTextureSize(256, 128);
      Shape55.mirror = true;
      setRotation(Shape55, -0.5235988F, 0F, 0F);
      Shape56 = new ModelRenderer(this, 46, 123);
      Shape56.addBox(0F, 0F, 0F, 1, 1, 3);
      Shape56.setRotationPoint(1F, 1F, 6F);
      Shape56.setTextureSize(256, 128);
      Shape56.mirror = true;
      setRotation(Shape56, 0F, 0F, 0F);
      Shape57 = new ModelRenderer(this, 56, 120);
      Shape57.addBox(0F, 0F, 0F, 1, 1, 6);
      Shape57.setRotationPoint(1F, 1F, 9F);
      Shape57.setTextureSize(256, 128);
      Shape57.mirror = true;
      setRotation(Shape57, -1.22173F, 0F, 0F);
      Shape58 = new ModelRenderer(this, 72, 120);
      Shape58.addBox(0F, 0F, 0F, 1, 1, 6);
      Shape58.setRotationPoint(1F, 6.7F, 11F);
      Shape58.setTextureSize(256, 128);
      Shape58.mirror = true;
      setRotation(Shape58, -2.356194F, 0F, 0F);
      Shape59 = new ModelRenderer(this, 88, 125);
      Shape59.addBox(0F, 0F, 0F, 1, 1, 1);
      Shape59.setRotationPoint(1F, 11F, 7F);
      Shape59.setTextureSize(256, 128);
      Shape59.mirror = true;
      setRotation(Shape59, -2.96706F, 0F, 0F);
      Shape3 = new ModelRenderer(this, 100, 100);
      Shape3.addBox(0.5F, 16.3F, -0.5F, 1, 1, 3);
      Shape3.setRotationPoint(-2F, -18F, 0F);
      Shape3.setTextureSize(256, 128);
      Shape3.mirror = true;
      setRotation(Shape3, 0F, 0F, 0.5235988F);
      Shape12 = new ModelRenderer(this, 110, 100);
      Shape12.addBox(0.5F, 14.3F, -1.5F, 1, 5, 1);
      Shape12.setRotationPoint(-2F, -18F, 0F);
      Shape12.setTextureSize(256, 128);
      Shape12.mirror = true;
      setRotation(Shape12, 0F, 0F, 0.5235988F);
      Shape13 = new ModelRenderer(this, 120, 100);
      Shape13.addBox(0.5F, 15.3F, -11.5F, 1, 3, 10);
      Shape13.setRotationPoint(-2F, -18F, 0F);
      Shape13.setTextureSize(256, 128);
      Shape13.mirror = true;
      setRotation(Shape13, 0F, 0F, 0.5235988F);
      Shape14 = new ModelRenderer(this, 145, 100);
      Shape14.addBox(0.5F, 15.8F, -12.5F, 1, 2, 1);
      Shape14.setRotationPoint(-2F, -18F, 0F);
      Shape14.setTextureSize(256, 128);
      Shape14.mirror = true;
      setRotation(Shape14, 0F, 0F, 0.5235988F);
      Shape15 = new ModelRenderer(this, 100, 115);
      Shape15.addBox(0.1F, 17.4F, -0.5F, 1, 1, 3);
      Shape15.setRotationPoint(4.5F, -17.5F, 0F);
      Shape15.setTextureSize(256, 128);
      Shape15.mirror = true;
      setRotation(Shape15, 0F, 0F, -0.5235988F);
      Shape16 = new ModelRenderer(this, 110, 115);
      Shape16.addBox(0.1F, 15.4F, -1.5F, 1, 5, 1);
      Shape16.setRotationPoint(4.5F, -17.5F, 0F);
      Shape16.setTextureSize(256, 128);
      Shape16.mirror = true;
      setRotation(Shape16, 0F, 0F, -0.5235988F);
      Shape18 = new ModelRenderer(this, 120, 115);
      Shape18.addBox(0.1F, 16.4F, -11.5F, 1, 3, 10);
      Shape18.setRotationPoint(4.5F, -17.5F, 0F);
      Shape18.setTextureSize(256, 128);
      Shape18.mirror = true;
      setRotation(Shape18, 0F, 0F, -0.5235988F);
      Shape19 = new ModelRenderer(this, 145, 115);
      Shape19.addBox(0.1F, 16.9F, -12.5F, 1, 2, 1);
      Shape19.setRotationPoint(4.5F, -17.5F, 0F);
      Shape19.setTextureSize(256, 128);
      Shape19.mirror = true;
      setRotation(Shape19, 0F, 0F, -0.5235988F);
      Shape20 = new ModelRenderer(this, 145, 0);
      Shape20.addBox(-12F, -16F, 0.5F, 1, 1, 1);
      Shape20.setRotationPoint(-1F, -17F, 3F);
      Shape20.setTextureSize(256, 128);
      Shape20.mirror = true;
      setRotation(Shape20, 0F, 0F, -0.0872665F);
      Shape21 = new ModelRenderer(this, 214, 0);
      Shape21.addBox(11.5F, -16F, 0.5F, 1, 1, 1);
      Shape21.setRotationPoint(3F, -17F, 3F);
      Shape21.setTextureSize(256, 128);
      Shape21.mirror = true;
      setRotation(Shape21, 0F, 0F, 0.0872665F);
      Shape22 = new ModelRenderer(this, 40, 72);
      Shape22.addBox(-0.4F, 16F, -0.6F, 1, 2, 1);
      Shape22.setRotationPoint(-2F, -18F, 0F);
      Shape22.setTextureSize(256, 128);
      Shape22.mirror = true;
      setRotation(Shape22, 0F, 0F, 0.5235988F);
      Shape23 = new ModelRenderer(this, 46, 72);
      Shape23.addBox(-0.4F, 16F, 0.5F, 1, 2, 1);
      Shape23.setRotationPoint(-2F, -18F, 0F);
      Shape23.setTextureSize(256, 128);
      Shape23.mirror = true;
      setRotation(Shape23, 0F, 0F, 0.5235988F);
      Shape30 = new ModelRenderer(this, 52, 72);
      Shape30.addBox(-0.4F, 16F, 1.6F, 1, 2, 1);
      Shape30.setRotationPoint(-2F, -18F, 0F);
      Shape30.setTextureSize(256, 128);
      Shape30.mirror = true;
      setRotation(Shape30, 0F, 0F, 0.5235988F);
      Shape45 = new ModelRenderer(this, 56, 76);
      Shape45.addBox(0F, 17.3F, 1.6F, 2, 1, 1);
      Shape45.setRotationPoint(-2F, -18F, 0F);
      Shape45.setTextureSize(256, 128);
      Shape45.mirror = true;
      setRotation(Shape45, 0F, 0F, 0.5235988F);
      Shape60 = new ModelRenderer(this, 48, 76);
      Shape60.addBox(0F, 17.3F, 0.5F, 2, 1, 1);
      Shape60.setRotationPoint(-2F, -18F, 0F);
      Shape60.setTextureSize(256, 128);
      Shape60.mirror = true;
      setRotation(Shape60, 0F, 0F, 0.5235988F);
      Shape61 = new ModelRenderer(this, 40, 76);
      Shape61.addBox(0F, 17.3F, -0.6F, 2, 1, 1);
      Shape61.setRotationPoint(-2F, -18F, 0F);
      Shape61.setTextureSize(256, 128);
      Shape61.mirror = true;
      setRotation(Shape61, 0F, 0F, 0.5235988F);
      Shape62 = new ModelRenderer(this, 40, 80);
      Shape62.addBox(1.5F, 16F, -0.6F, 1, 2, 1);
      Shape62.setRotationPoint(-2F, -18F, 0F);
      Shape62.setTextureSize(256, 128);
      Shape62.mirror = true;
      setRotation(Shape62, 0F, 0F, 0.5235988F);
      Shape63 = new ModelRenderer(this, 46, 80);
      Shape63.addBox(1.5F, 16F, 0.5F, 1, 2, 1);
      Shape63.setRotationPoint(-2F, -18F, 0F);
      Shape63.setTextureSize(256, 128);
      Shape63.mirror = true;
      setRotation(Shape63, 0F, 0F, 0.5235988F);
      Shape64 = new ModelRenderer(this, 52, 80);
      Shape64.addBox(1.5F, 16F, 1.6F, 1, 2, 1);
      Shape64.setRotationPoint(-2F, -18F, 0F);
      Shape64.setTextureSize(256, 128);
      Shape64.mirror = true;
      setRotation(Shape64, 0F, 0F, 0.5235988F);
      Shape65 = new ModelRenderer(this, 77, 72);
      Shape65.mirror = true;
      Shape65.addBox(1.4F, 16.5F, 1.6F, 1, 2, 1);
      Shape65.setRotationPoint(4.5F, -17F, 0F);
      Shape65.setTextureSize(256, 128);
      Shape65.mirror = true;
      setRotation(Shape65, 0F, 0F, -0.5235988F);
      Shape65.mirror = false;
      Shape66 = new ModelRenderer(this, 71, 72);
      Shape66.addBox(1.4F, 16.5F, 0.5F, 1, 2, 1);
      Shape66.setRotationPoint(4.5F, -17F, 0F);
      Shape66.setTextureSize(256, 128);
      Shape66.mirror = true;
      setRotation(Shape66, 0F, 0F, -0.5235988F);
      Shape67 = new ModelRenderer(this, 65, 72);
      Shape67.addBox(1.4F, 16.5F, -0.6F, 1, 2, 1);
      Shape67.setRotationPoint(4.5F, -17F, 0F);
      Shape67.setTextureSize(256, 128);
      Shape67.mirror = true;
      setRotation(Shape67, 0F, 0F, -0.5235988F);
      Shape68 = new ModelRenderer(this, 73, 76);
      Shape68.addBox(0F, 18F, 0.5F, 2, 1, 1);
      Shape68.setRotationPoint(4.5F, -17F, 0F);
      Shape68.setTextureSize(256, 128);
      Shape68.mirror = true;
      setRotation(Shape68, 0F, 0F, -0.5235988F);
      Shape69 = new ModelRenderer(this, 65, 76);
      Shape69.addBox(0F, 18F, -0.6F, 2, 1, 1);
      Shape69.setRotationPoint(4.5F, -17F, 0F);
      Shape69.setTextureSize(256, 128);
      Shape69.mirror = true;
      setRotation(Shape69, 0F, 0F, -0.5235988F);
      Shape70 = new ModelRenderer(this, 81, 76);
      Shape70.addBox(0F, 18F, 1.6F, 2, 1, 1);
      Shape70.setRotationPoint(4.5F, -17F, 0F);
      Shape70.setTextureSize(256, 128);
      Shape70.mirror = true;
      setRotation(Shape70, 0F, 0F, -0.5235988F);
      Shape71 = new ModelRenderer(this, 77, 80);
      Shape71.addBox(-0.7F, 16.5F, 1.6F, 1, 2, 1);
      Shape71.setRotationPoint(4.5F, -17F, 0F);
      Shape71.setTextureSize(256, 128);
      Shape71.mirror = true;
      setRotation(Shape71, 0F, 0F, -0.5235988F);
      Shape72 = new ModelRenderer(this, 71, 80);
      Shape72.addBox(-0.7F, 16.5F, 0.5F, 1, 2, 1);
      Shape72.setRotationPoint(4.5F, -17F, 0F);
      Shape72.setTextureSize(256, 128);
      Shape72.mirror = true;
      setRotation(Shape72, 0F, 0F, -0.5235988F);
      Shape73 = new ModelRenderer(this, 65, 80);
      Shape73.addBox(-0.7F, 16.5F, -0.6F, 1, 2, 1);
      Shape73.setRotationPoint(4.5F, -17F, 0F);
      Shape73.setTextureSize(256, 128);
      Shape73.mirror = true;
      setRotation(Shape73, 0F, 0F, -0.5235988F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Shape1.render(f5);
    Shape1b.render(f5);
    Shape1c.render(f5);
    Shape2.render(f5);
    Shape2b.render(f5);
    Shape2c.render(f5);
    Shape2d.render(f5);
    Shape4.render(f5);
    Shape5.render(f5);
    Shape7.render(f5);
    Shape7b.render(f5);
    Shape5b.render(f5);
    Shape5c.render(f5);
    Shape8.render(f5);
    Shape9.render(f5);
    Shape10.render(f5);
    Shape11.render(f5);
    Shape10b.render(f5);
    Shape17.render(f5);
    Shape24.render(f5);
    Shape25.render(f5);
    Shape26.render(f5);
    Shape27.render(f5);
    Shape28.render(f5);
    Shape33.render(f5);
    Shape6.render(f5);
    Shape29.render(f5);
    Shape31.render(f5);
    Shape32.render(f5);
    Shape34.render(f5);
    Shape35.render(f5);
    Shape36.render(f5);
    Shape37.render(f5);
    Shape38.render(f5);
    Shape39.render(f5);
    Shape40.render(f5);
    Shape41.render(f5);
    Shape43.render(f5);
    Shape42.render(f5);
    Shape6b.render(f5);
    Shape44.render(f5);
    Shape46.render(f5);
    Shape47.render(f5);
    Shape48.render(f5);
    Shape49.render(f5);
    Shape50.render(f5);
    Shape51.render(f5);
    Shape52.render(f5);
    Shape53.render(f5);
    Shape41b.render(f5);
    Shape54.render(f5);
    Shape43b.render(f5);
    Shape42b.render(f5);
    Shape55.render(f5);
    Shape56.render(f5);
    Shape57.render(f5);
    Shape58.render(f5);
    Shape59.render(f5);
    Shape3.render(f5);
    Shape12.render(f5);
    Shape13.render(f5);
    Shape14.render(f5);
    Shape15.render(f5);
    Shape16.render(f5);
    Shape18.render(f5);
    Shape19.render(f5);
    Shape20.render(f5);
    Shape21.render(f5);
    Shape22.render(f5);
    Shape23.render(f5);
    Shape30.render(f5);
    Shape45.render(f5);
    Shape60.render(f5);
    Shape61.render(f5);
    Shape62.render(f5);
    Shape63.render(f5);
    Shape64.render(f5);
    Shape65.render(f5);
    Shape66.render(f5);
    Shape67.render(f5);
    Shape68.render(f5);
    Shape69.render(f5);
    Shape70.render(f5);
    Shape71.render(f5);
    Shape72.render(f5);
    Shape73.render(f5);
  }

  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}
