//@LICENSE@

package com.vlsolutions.swing.docking;

/** Interface describing a container that can be used to display more than
 * one Dockable in a Tabbed Pane fashion.
 *<p>
 * This interface is meant for API Extenders in order to provide new kinds of
 * TabbedDockableContainers (the default implementation is <code>DockTabbedPane</code>).

 *
 * @author Lilian Chamontin, vlsolutions.
 * @version 1.0
 */

public interface TabbedDockableContainer extends DockableContainer {

  /** Returns the currently selected (front) dockable */
  public Dockable getSelectedDockable();

  /** Change the tab selection to display this dockable */
  public void setSelectedDockable(Dockable dockable);

  /** Returs the current tab count (which is also the current dockable count) */
  public int getTabCount();

  /** Returns the dockable at the index tab */
  public Dockable getDockableAt(int index);

  /** Adds a dockable to the given index tab. */
  public void addDockable(Dockable dockable, int index);

  /** Removes a dockable from the tabs */
  public void removeDockable(Dockable dockable);

  /** Remove the dockable at specified index tab */
  public void removeDockable(int index);

  /** Returns the index of the given dockable */
  public int indexOfDockable(Dockable dockable);


}