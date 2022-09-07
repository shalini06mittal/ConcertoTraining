import { AbstractControl, FormControl } from "@angular/forms";

export function hasExclamationMark(input: AbstractControl) {
    const hasExclamation = input.value.indexOf('!') >= 0;
    return hasExclamation ? null : { needsExclamation: true };
  }