package blobs.models.attacks;

import blobs.interfaces.Attack;
import blobs.models.Blob;

public abstract class AbstractAttack implements Attack {
    public abstract void execute(Blob attacker, Blob target);
}
